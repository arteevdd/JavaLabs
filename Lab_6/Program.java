package Lab_6;

import java.util.Random;

public class Program {

    private static State state = State.RUNNING;
    private static final Object mutex = new Object();
    private static Thread abstractProgram = new Thread(new AbstractProgram());

    static class AbstractProgram implements Runnable {

        @Override
        public void run() {
            Thread daemon = new Thread(() -> {
                    while (true) {
                    Utils.pause(5000);
                    if (abstractProgram.isInterrupted()) {
                        break;
                    }
                    synchronized (mutex) {
                        System.out.println("Current program status: " + state.toString());
                        state = State.values()[new Random().nextInt(State.values().length)];
                        System.out.println("Demon change program state: " + state.toString());
                        mutex.notify();
                    }
                }
            });
            daemon.setDaemon(true);
            daemon.start();
            
            while (!Thread.currentThread().isInterrupted()) {
                uselessWork();
            }
        }

        private void uselessWork() {
            int counter = 0;
            counter++;
        }
    }

    static class Supervisor implements Runnable {
        @Override
        public void run() {
            System.out.println("SuperVisor start!");
            abstractProgram.start();
            while (!abstractProgram.isInterrupted()) {
                synchronized (mutex) {
                    try {
                        mutex.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    switch (state) {
                        case FATAL_ERROR -> stopProgram();
                        case UNKNOWN, STOPPING -> runProgram();
                        default -> System.out.println("SuperVisor didn't do anything");
                    }
                }
            }
        }

        private void runProgram() {
            state = State.RUNNING;
            System.out.println("SuperVisor restarted the program");
        }

        private void stopProgram() {
            abstractProgram.interrupt();
            System.out.println("SuperVisor be stop");
        }
    }
}
