package Lab_7;

import java.util.concurrent.BlockingQueue;

public class Writer implements Runnable {
    private BlockingQueue<Message> queue;

    public  Writer(BlockingQueue<Message> queue){
        this.queue = queue;
    }

    @Override
    public void run(){
        Message newMessage = new Message("text ", (int) (Math.random() * 777));
        try{
            queue.put(newMessage);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Writer " + Thread.currentThread().getName() + " put " + newMessage.getMessage());
    }
}
