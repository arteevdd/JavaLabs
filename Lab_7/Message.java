package Lab_7;

public class Message {
    String message;
    int number;

    public Message(String mes, int count){
        this.message = mes;
        this.number = count;
    }

    public String getMessage(){
        return message + number;
    }
}
