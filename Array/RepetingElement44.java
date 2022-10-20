package p1;

public class RepetingElement44 {
    public static void find2repetElement(int[] arr1, int arrSize) {
        System.out.print("The repeating elements are: ");
        for(int i = 0; i < arrSize; i++) {
            for(int j = i + 1; j < arrSize; j++) {
                if(arr1[i] == arr1[j]) {
                    System.out.print(" " + arr1[i] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 7, 4, 7, 8, 3, 4};
        int ctr = (int)arr1.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < ctr; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();

        find2repetElement(arr1, ctr);
    }
}

