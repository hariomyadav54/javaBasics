package p1;

public class ContiguousSubarray35 {
    public static int maxSum(int[] a,int n) {
        int sum, maxSum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                sum = 0;
                for(int k = i; k <= j; k++) {
                    sum = sum + a[k];
                }
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr1 = {8, 3, 8, -5, 4, 3, -4, -3, 5};
        int ctr = (int)arr1.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < ctr; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        System.out.println("The largest sum of contiguous subarray is : " + maxSum(arr1, ctr) + " ");
    }
}
