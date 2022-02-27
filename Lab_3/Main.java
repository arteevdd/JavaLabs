package Lab_3;

import java.util.List;

import Lab_3.Animals.*;

public class Main {
    public static void main(String[] args) {
        Queue<Animals> queue = new Queue<>(10);
        queue.add(new Chordata());
        queue.add(new Mammalia());
        queue.add(new Primates());
        queue.add(new Hominidae());
        queue.add(new Homo());
        queue.add(new HomoSapiens());
        System.out.println("Original queue: ");
        System.out.println(queue.toString());


        Queue<? extends Mammalia> producedQueue = Utils.produce(queue);
        System.out.println("Method Produced: ");
        System.out.println(producedQueue.toString());

        List<Queue<? super HomoSapiens>> consumedQueue = Utils.consume(producedQueue);
        System.out.println("Parent classes of class Primates: ");
        System.out.println(consumedQueue.get(0).toString());
        System.out.println("Parent classes of class Homo: ");
        System.out.println(consumedQueue.get(1).toString());
    }
}
