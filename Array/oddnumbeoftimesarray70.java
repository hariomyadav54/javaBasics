package p1;

public class oddnumbeoftimesarray70 {
    public static void twoNumberOddOccure(int[] arr1, int arrSize) {
        int xor2 = arr1[0];
        int setbitno;
        int n = arrSize - 2;
        int num1 = 0, num2 = 0;
        for(int i = 1; i < arrSize; i++) {
            xor2 = xor2 ^ arr1[i];
        }
        setbitno = xor2 & ~(xor2 - 1);
        for(int i = 0; i < arrSize; i++) {
            if((arr1[i] & setbitno) != 0) {
                num1 = num1 ^ arr1[i];
            } else {
                num2 = num2 ^ arr1[i];
            }
        }
        System.out.print("The two numbers occuring odd number of times are: " + num1 + " & " + num2 + " ");
    }
    public static void main(String[] args) {
        int[] arr1 = {6, 7, 3, 6, 8, 7, 6, 8, 3, 3};
        int arrSize = (int)arr1.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < arrSize; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        twoNumberOddOccure(arr1, arrSize);
    }
}
