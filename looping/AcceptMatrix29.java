package p1;

import java.util.InputMismatchException;
import java.util.Scanner;
public class AcceptMatrix29 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int[][] arr1 = new int[10][10];
            int r, c;
            int ctr = 0;
            System.out.print("Input the number of rows of the matrix : ");
            r = sc.nextInt();
            System.out.print("Input the number of columns of the matrix : ");
            c = sc.nextInt();
            System.out.println("Input elements in the first matrix :");
            for (int i = 0; i < r; i++)
            {
                for (int j = 0; j < c; j++)
                {
                    System.out.print("element - [" + i + "],[" + j + "] : ");
                    arr1[i][j] = sc.nextInt();
                    if (arr1[i][j] == 0)
                    {
                        ++ctr;
                    }
                }
            }
            if (ctr > (r * c) / 2) {
                System.out.println("The given matrix is sparse matrix. ");
            } else {
                System.out.println("The given matrix is not a sparse matrix.");
            }
            System.out.println("There are " + ctr + " number of zeros in the matrix.\n");
        } catch (InputMismatchException e) {
            System.out.println("Miamatch input");
        }
    }
}

