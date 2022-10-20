package p1;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Determintion28 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int i, j, x, y, z, determinant = 0;
        try{
       Scanner sc= new Scanner(System.in);
        System.out.println("\n Please Enter the first Items :  ");
        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
            }
        } catch (InputMismatchException e){
            System.out.println("Miasmatch input");
            System.exit(0);
        }
        x = (arr[1][1] * arr[2][2]) - (arr[2][1] * arr[1][2]);
        y = (arr[1][0] * arr[2][2]) - (arr[2][0] * arr[1][2]);
        z = (arr[1][0] * arr[2][1]) - (arr[2][0] * arr[1][1]);
        determinant = (arr[0][0] * x)- (arr[0][1] * y) + (arr[0][2] * z);
        System.out.println("The Determinant of 3 * 3 Matrix = " + determinant );
    }
}
