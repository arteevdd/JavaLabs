package Lab_3.Exceptions;

public class EmptyQueue extends RuntimeException{
    public EmptyQueue(){
        super("Lab_3.Queue is empty!");
    }
}
