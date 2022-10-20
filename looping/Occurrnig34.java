package p1;

public class Occurrnig34 {
    public static int findOddCountElem(int[]arr1,int n) {
        int result = 0;
        for(int i = 0; i < n; i++) {
            result = result ^ arr1[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {8, 3, 8, 5, 4, 3, 4,3, 5};
        int ctr = (int)arr1.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < ctr; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        System.out.println("Number of odd number occur(s) : " + findOddCountElem(arr1, ctr) + " times.");
    }
}

