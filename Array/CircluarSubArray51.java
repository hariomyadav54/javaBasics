package p1;

public class CircluarSubArray51 {
    public static int sumOfMxCircur(int[] arr1, int n) {
        int maxKadaneSum = kadane(arr1, n);
        int maxWrap = 0;
        for(int i = 0; i < n; i++) {
            maxWrap += arr1[i];
            arr1[i] = -arr1[i];
        }
        maxWrap = maxWrap + kadane(arr1, n);
        return maxWrap > maxKadaneSum ? maxWrap : maxKadaneSum;
    }
    public static int kadane(int[] arr1, int n) {
        int maxUpto = 0, maxAtPos = 0;
        for(int i = 0; i < n; i++) {
            maxAtPos = maxAtPos + arr1[i];
            if(maxAtPos < 0) {
                maxAtPos = 0;
            }
            if(maxUpto < maxAtPos) {
                maxUpto = maxAtPos;
            }
        }
        return maxUpto;
    }
    public static void main(String[] args) {
        int[] arr1 = {10, 8, -20, 5, -3, -5, 10, -13, 11};
        int n = (int)arr1.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        System.out.println("The maximum circular sum in the above array is:  " + sumOfMxCircur(arr1, n));
    }
}
