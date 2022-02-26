package Lab_2;

import java.io.*;

import Lab_2.exceptions.largeMatrix;
import Lab_2.exceptions.tinyMatrix;
import static Lab_2.Utils.readSize;

public class Main
{
    public static void main(String[] args) throws largeMatrix, tinyMatrix, IOException
    {
        try(FileWriter writer = new FileWriter("src/Lab_2/output.txt")) {

            int size = readSize();
            Matrix matrix = new Matrix(size);
            matrix.fillMatrix();

            matrix.printMatrix();

        } catch(FileNotFoundException e) {
            throw new FileNotFoundException();
        }
    }
}
