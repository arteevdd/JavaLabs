package Lab_2;

import Lab_2.exceptions.largeMatrix;
import Lab_2.exceptions.tinyMatrix;
import Lab_2.exceptions.divZeroException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utils {
    public static int readSize() throws FileNotFoundException, largeMatrix, tinyMatrix {
     try{
         File file = new File("src/Lab_2/input.txt");
         Scanner scanner = new Scanner((file));
         int size = scanner.nextInt();
         if (size > 1_000_000) {
             throw new largeMatrix();
         }
         if (size == 0 || size < 0 ){
             throw new tinyMatrix();
         }
         return size;
     }catch(FileNotFoundException e) {
         throw new FileNotFoundException();
     }
    }

    public static int divide(int dividend, int divisor) throws divZeroException{
        if (divisor == 0) {
            throw new divZeroException();
        }
        return dividend / divisor;
    }

}
