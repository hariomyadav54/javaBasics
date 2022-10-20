package p1;
import java.util.Scanner;
public class Upper27 {
    public static void main(String[] args) {
        int a[][] = new int[3][3], i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of the square matrix");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.printf("Elements in the first matrix :[" + i + "" + j + "] ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Matrix is....");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("\nThe upper triangular matrix is: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
