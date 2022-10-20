package p1;

public class MajorityElement49 {
    public static void findMajElem(int[] arr1, int n) {
        int indexOfMajElem = 0, ctr = 1;
        for(int i = 1; i < n; i++) {
            if(arr1[indexOfMajElem] == arr1[i]) {
                ctr++;
            } else {
                ctr--;
            }
            if(ctr == 0) {
                indexOfMajElem = i;
                ctr = 1;
            }
        }
        ctr = 0;
        for(int i = 0; i < n; i++) {
            if(arr1[i] == arr1[indexOfMajElem]) {
                ctr++;
            }
        }
        if(ctr > n / 2) {
            System.out.println("Majority Element : " + arr1[indexOfMajElem]);
        } else {
            System.out.println("There are no Majority Elements in the given array.");
        }
    }
    public static void main(String[] args) {
        int ctr, m;
        int[] arr1 = {1,3, 3, 5, 4, 3, 2,3,3};
        ctr = (int)arr1.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < ctr; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        findMajElem(arr1, ctr);
    }
}
