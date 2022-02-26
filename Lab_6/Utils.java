package Lab_6;

import java.util.Random;

public class Utils {
    public static void pause(int millis){
        try{
            Thread.sleep(new Random().nextInt(millis));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
