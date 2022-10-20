package p1;

public class sortedandrotated {
    public static int findMin(int[] arr1, int start, int end) {
        if(start == end) {
            return arr1[start];
        }
        int mid = (start + end) / 2;
        if(arr1[start] > arr1[mid]) {
            return findMin(arr1, start, mid);
        } else if(arr1[mid] > arr1[end]) {
            return findMin(arr1, mid + 1, end);
        } else {
            return arr1[start];
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 6, 7, 9, 2};
        int n = (int)arr1.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        int min = findMin(arr1, 0, n - 1);
        System.out.print("The minimum element in the above array is: " + min + " ");
    }
}
