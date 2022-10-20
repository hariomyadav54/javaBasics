package p1;

public class largestsubarray62 {
    public static void findLrgSubArray(int[] arr1, int arrSize) {
        int sum = 0, lrgSize = Integer.MIN_VALUE, left = 0;
        for(int i = 0; i < arrSize - 1; i++) {
            sum = arr1[i] != 0 ? 1 : -1;
            for(int j = i + 1; j < arrSize; j++) {
                if(arr1[j] == 1) {
                    sum += 1;
                } else {
                    sum += -1;
                }
                if(sum == 0 && lrgSize < j - i + 1) {
                    lrgSize = j - i + 1;
                    left = i;
                }
            }
        }
        if(lrgSize == Integer.MIN_VALUE) {
            System.out.print("No such subarray found from the given array.");
        } else {
            System.out.print("Subarray found from the index " + left + " to " + (left + lrgSize - 1));
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 0, 1, 1, 0, 1, 1, 1};
        int n = (int)arr1.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        findLrgSubArray(arr1, n);
    }
}