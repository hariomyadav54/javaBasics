package p1;

public class OccurringOdd33 {
    public static void findMajElem(int[] arr1, int n) {
        int indexOfMajElem = 0, count = 1;
        for (int i = 1; i < n; i++) {
            if (arr1[indexOfMajElem] == arr1[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                indexOfMajElem = i;
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr1[i] == arr1[indexOfMajElem]) {
                count++;
            }
        }
        if (count > n / 2) {
            System.out.println("Majority Element : " + arr1[indexOfMajElem]);
        } else {
            System.out.println("There are no Majority Elements in the given array.");
        }
    }
    public static void main(String[] args) {
        int ctr, m;
        int[] arr1 = {4, 8, 4, 6, 7, 4, 4, 8};
        ctr = (int) arr1.length;
        System.out.print("The given array is :  ");
        for (int i = 0; i < ctr; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        findMajElem(arr1, ctr);
    }
}
