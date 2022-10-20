package p1;

public class Productsubarray {
    public static int min(int p, int q) {
        return p < q ? p : q;
    }
    public static int max(int p, int q) {
        return p > q ? p : q;
    }
    public static int maxProduct(int[] arr1, int n) {
        int maxend = 0, minend = 0;
        int maxupto = 0;
        for(int i = 0; i < n; i++) {
            int temp = maxend;
            maxend = max(arr1[i], max(arr1[i] * maxend, arr1[i] * minend));
            minend = min(arr1[i], min(arr1[i] * temp, arr1[i] * minend));
            maxupto = max(maxupto, maxend);
        }
        return maxupto;
    }
    public static void main(String[] args) {
        int[] arr1 = {-4, 9, -7, 0, -15, 6, 2, -3};
        int n = (int)arr1.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        System.out.print("The maximum product of a sub-array in the given array is:  " + maxProduct(arr1, n));
    }
}
