package Lab_3.Exceptions;

public class FullQueue extends RuntimeException{
    public FullQueue(){
        super("Lab_3.Queue is full!");
    }
}
