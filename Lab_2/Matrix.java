package Lab_2;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import Lab_2.exceptions.divZeroException;

import static Lab_2.Utils.divide;

public class Matrix {
    public int[][] matrix;
    public int n;

    Matrix(int n) {
        this.n = n;
        matrix = new int[n][n];
    }

    void fillMatrix() {
        int max = n;
        int min = -n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * (max - min + 1)) + min;
            }
        }
    }

    void printMatrix(){
        try(FileWriter writer = new FileWriter("src/Lab_2/output.txt")) {
            for (int k = 0; k < 4; k++) {
                int n = matrix.length;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        writer.write(matrix[i][j] + " ");
                    }
                    writer.write("\n");
                }
                writer.write("\n");
                rotateMatrix();
                divideOnNeighboringNumbers();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    void rotateMatrix() {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n / 2; i++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - i - 1][j];
                matrix[n - i - 1][j] = temp;
            }
        }
    }

    void divideOnNeighboringNumbers() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int leftMember = (j == 0) ? (matrix[i][n - 1]) : (matrix[i][j - 1]);
                int rightMember = matrix[i][(j + 1) % n];
                try {
                    matrix[i][j] = divide(matrix[i][j], leftMember + rightMember);
                } catch (divZeroException e) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}