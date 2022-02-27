package Lab_6;

public class Main {
    public static void main(String[] args) {
        new Thread(new Program.Supervisor()).start();
    }
}

