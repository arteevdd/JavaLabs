package Lab_7;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread("thread");
        thread.start();
        int n = 0;
        try {
            n = Integer.parseInt(args[0]);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        BlockingQueue<Message> queue = new LinkedBlockingQueue();

        Writer writers = new Writer(queue);
        Reader readers = new Reader(queue);

        System.out.println("Call writers: " );
        for (int i = 0; i < n; i++)
        {
            new Thread(writers).start();
            Utils.pause(2000);
        }

        System.out.println("Call readers: ");
        for (int i = 0; i < n; i++)
        {
            new Thread(readers).start();
            Utils.pause(2000);
        }
    }
}

