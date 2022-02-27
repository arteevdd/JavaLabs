package Lab_7;

public class Utils {
    public static void pause(int millis){
        try{
            Thread.sleep(millis);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
