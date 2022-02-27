package Lab_3;

import java.util.List;
import java.util.ArrayList;

import Lab_3.Exceptions.*;

public class Queue<E> {

    private List<E> data;
    private final int capacity;

    public Queue(int capacity){
        this.data = new ArrayList<>(capacity);
        this.capacity = capacity;
    }

    public void add(E elem) {
        if(elem == null) {
            throw new EmptyQueue();
        }
        if(isFull()){
            throw new FullQueue();
        }
        data.add(elem);
    }

    public E get(int index){
        if(isEmpty()){
            throw new EmptyQueue();
        }
        return data.get(index);
    }

    public int getSize(){
        return data.size();
    }

    public boolean isFull() {
        return getSize() == capacity;
    }

    public boolean isEmpty(){
        return data.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (E e : data) {
            sb.append(e.toString());
            sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

}
