package p1;

import java.util.Scanner;

public class maximumnm88 {
    public static int findMaxDiffercence(int[] arr1, int arSize) {
        int mandndiff = -1;

        for(int m = 0; m < arSize; ++m) {
            for(int n = arSize - 1; n > m; --n) {
                if(arr1[n] > arr1[m] && mandndiff < n - m) {
                    System.out.println("m = " + m + ",    n = " + n + ",   arr1[m] =  " + arr1[m] + "   arr1[n] = " + arr1[n] + "    difference = " + (n - m));
                    mandndiff = n - m;
                }
            }
        }
        return mandndiff;
    }
    public static void main(String[] args) {
        int[] arr1 = {7, 5, 8, 2, 3, 2, 4, 2, 1, 0};
        int n = (int)arr1.length;

        System.out.println("The given array is:  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();

        int mandndiff = findMaxDiffercence(arr1, n);
        System.out.print("\nThe maximum differcences between two position of array index is: " + mandndiff);
        nextChar(STDIN_SCANNER);
    }

    public final static Scanner STDIN_SCANNER = new Scanner(System.in);
    public final static int nextChar(Scanner scanner) {
        scanner.useDelimiter("");
        int ret = scanner.next().charAt(0);
        scanner.reset();
        return ret;
    }
}
