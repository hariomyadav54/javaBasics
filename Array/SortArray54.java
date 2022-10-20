package p1;

public class SortArray54 {
    public static void changePlace(int[] arr1, int i, int j) {
        int tmp = arr1[i];
        arr1[i] = arr1[j];
        arr1[j] = tmp;
    }
    public static int sortElements(int[] arr1, int end) {
        int start = 0, mid = 0;
        int pivot = 1;
        while(mid <= end) {
            if(arr1[mid] < pivot) {
                changePlace(arr1, start, mid);
                ++start;
                ++mid;
            } else if(arr1[mid] > pivot) {
                changePlace(arr1, mid, end);
                --end;
            } else {
                ++mid;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0};
        int n = (int)arr1.length;

        System.out.print("The given array is :  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        System.out.println("After sortig the elements in the array are: ");
        sortElements(arr1, n - 1);
        for(int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
