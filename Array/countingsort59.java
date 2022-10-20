package p1;

public class countingsort59 {
    public static void countingSort(int[] arr1, int n, int max) {
        int[] count = new int[50];
        for(int i = 0; i < n; ++i) {
            count[arr1[i]] = count[arr1[i]] + 1;
        }
        System.out.print("After sorting the elements in the array are:  ");
        for(int i = 0; i <= max; ++i) {
            for(int j = 1; j <= count[i]; ++j) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int max = 0;
        int[] arr1 = {4, 14, 8, 0, 2, 5, 2, 1, 0, 17, 9, 0, 5};
        int n = (int)arr1.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < n; i++) {
            if(arr1[i] > max) {
                max = arr1[i];
            }
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        countingSort(arr1, n, max);
    }
}
