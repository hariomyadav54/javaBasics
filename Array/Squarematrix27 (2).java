package p1;

import java.lang.ref.SoftReference;
import java.util.Scanner;
public class Squarematrix27 {
    public static void main(String[] args) {
        int a[][]= new int [3][3],i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of the square matrix");
        for( i=0;i<3;i++){
            for ( j=0; j<3;j++){
                System.out.printf("elements in the first matrix :["+i+""+j+"] ");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Matrix is....");
        for (i=0; i<3; i++){
            for (j=0; j<3;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println(" ");
        }
        System.out.printf("Setting zero in upper triangular matrix");
        for (i=0; i<3;i++){
            for (j=0;j<3;j++){
                if (i<j){
                    System.out.printf(a[i][j]+"");
                }
            }
        }
    }
}
