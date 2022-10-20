package p1;

public class jumaps56 {
    public static int noOfJumps(int[] arr1, int low, int high) {
        if(high == low) {
            return 0;
        }
        if(arr1[low] == 0) {
            return Integer.MAX_VALUE;
        }
        int min = Integer.MAX_VALUE;
        for(int i = low + 1; i <= high && i <= low + arr1[low]; i++) {
            int jumps = noOfJumps(arr1, i, high);
            if(jumps != Integer.MAX_VALUE && jumps + 1 < min) {
                min = jumps + 1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9, 1, 1, 1};
        int n = (int)arr1.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        System.out.print("The minimum of number of jumps is required to reach the end is:  " + noOfJumps(arr1, 0, n - 1) + " ");
    }
}
