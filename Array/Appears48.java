package p1;

public class Appears48 {
    public static boolean chkMajority(int[] arr1, int arrSize, int x) {
        int lastIndex = arrSize % 2 != 0 ? arrSize / 2 + 1 : arrSize / 2; // check last index even or odd
        for(int i = 0; i < lastIndex; i++) {
            if(arr1[i] == x && arr1[i + arrSize / 2] == x) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 3, 5, 4, 3, 2, 3, 3};
        int arrSize = (int)arr1.length;
        int x = 3;
        System.out.print("The given array is :  ");
        for(int i = 0; i < arrSize; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        System.out.println("The given value is :  " + x);
        if(chkMajority(arr1, arrSize, x)) {
            System.out.print(x + " appears more than " + (arrSize / 2) + " times in the given array[]");
        } else {
            System.out.print(x + " does not appear more than " + (arrSize / 2) + " times in the given array[]");
        }
    }
}
