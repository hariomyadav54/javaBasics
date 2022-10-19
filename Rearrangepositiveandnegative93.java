package p1;
public class Rearrangepositiveandnegative93 {
    public static void changeNumber(int[] arr1, int i, int j) {
        int temp = arr1[i];
        arr1[i] = arr1[j];
        arr1[j] = temp;
    }
    public static void splitPosNeg(int[] arr1, int size) {
        int temp, left = 0, right = size - 1;
        while(right > left) {
            while(arr1[left] < 0) {
                left++;
            }
            while(arr1[right] > 0) {
                right--;
            }
            if(left < right) {
                changeNumber(arr1, left, right);
            }
        }
    }
    public static void rearrangeNumbers(int[] arr1, int size) {
        int i;
        splitPosNeg(arr1, size);
        for(i = 0; arr1[i] < 0; i++) {
            ;
        }
        for(int j = 1; j < i && arr1[j] < 0; j += 2) {
            changeNumber(arr1, i, j);
            i++;
        }
        return;
    }
    public static void main(String[] args) {
        int[] arr1 = {-4, 8, -5, -6, 5, -9, 7, 1, -21, -11, 19};
        int arrSize = (int)arr1.length;
        System.out.println("The given array is:  ");
        for(int i = 0; i < arrSize; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        System.out.println("The rearranged array is:  ");
        rearrangeNumbers(arr1, 10);
        for(int i = 0; i < 11; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
