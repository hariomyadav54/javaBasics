package p1;

public class uniqueelementsunsortedarray73 {

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 8, 5, 7, 3, 2, 4, 1, 6, 2};
        int n = (int)arr1.length;
        int j;
        System.out.print("The given array is :  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        System.out.println("Unique Elements in the given array are: ");
        for(int i = 0; i < n; i++) {
            for(j = 0; j < i; j++) {
                if(arr1[i] == arr1[j]) {
                    break;
                }
            }
            if(i == j) {
                System.out.print(arr1[i] + " ");
            }
        }
    }
}