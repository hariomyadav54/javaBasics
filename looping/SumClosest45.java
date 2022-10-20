package p1;

public class SumClosest45 {
    public static void findMinSumPair(int[] arr1, int arrSize) {
        int sum, minSum, min1pair, min2pair;
        if(arr1 == null || arrSize < 2) {
            return;
        }
        min1pair = arr1[0];
        min2pair = arr1[1];
        minSum = min1pair + min2pair;
        for(int i = 0; i < arrSize - 1; i++) {
            for(int j = i + 1; j < arrSize; j++) {
                sum = arr1[i] + arr1[j];
                if(Math.abs(sum) < Math.abs(minSum)) {
                    minSum = sum;
                    min1pair = arr1[i];
                    min2pair = arr1[j];
                }
            }
        }
        System.out.println("[" + min1pair + ", " + min2pair + "]");
    }
    public static void main(String[] args) {
        int[] arr1 = {38, 44, 63, -51, -35, 19, 84, -69, 4, -46};
        int ctr = (int)arr1.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < ctr; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        System.out.println("The Pair of elements whose sum is minimum are: ");
        findMinSumPair(arr1, ctr);
    }
}
