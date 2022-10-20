package p1;

import java.util.Scanner;

public class CelingSort40 {
    public static int findCeiling(int[] arr1, int low, int high, int x) {
        if(x <= arr1[low]) {
            return low;
        }
        for(int i = low; i < high; i++) {
            if(arr1[i] == x) {
                return i;
            }
            if(arr1[i] < x && arr1[i + 1] >= x) {
                return i + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 7, 8, 9, 9, 10};
        int ctr = (int)arr1.length;
        int x = 5;
        System.out.print("The given array is :  ");
        for(int i = 0; i < ctr; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        int index = findCeiling(arr1, 0, ctr - 1, x);
        if(index == -1) {
            System.out.print("No ceiling for the number " + x + "  exists in array. ");
        } else {
            System.out.print("The ceiling of " + x + " is: " + arr1[index]);
        }
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
