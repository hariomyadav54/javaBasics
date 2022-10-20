package p1;

import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class UpperTringle27 {
    public static void main(String[] args) {
        int rows=0,column=0;
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.next());
        int  inputMatrix[][] = new int[size][size];
        System.out.println("The matrix is defined as: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(inputMatrix[i][j] + " ");
            }
            System.out.println();
        }
        if (rows != column) {
            return;
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < column; j++) {
                    if (i > j) {
                        inputMatrix[i][j] = 0;
                    }
                }
            }
            System.out.println("\nThe upper triangular matrix is: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print(inputMatrix[j][i] + " ");
                }
                System.out.println();
            }
        }
    }
}
