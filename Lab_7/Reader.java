package Lab_7;

import java.util.concurrent.BlockingQueue;

public class Reader implements Runnable {

    private BlockingQueue<Message> queue;

    public Reader(BlockingQueue<Message> queue){
        this.queue = queue;
    }

    @Override
    public void run(){
        try{
           Utils.pause(2000);
           System.out.println("Reader " + Thread.currentThread().getName() + " took " + queue.take().getMessage());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
