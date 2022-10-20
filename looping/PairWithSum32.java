package p1;

public class PairWithSum32 {
        public static void checkForSum(int arr1[], int n, int s) {
            for(int i = 0; i < n - 1; i++) {
                for(int j = i + 1; j < n; j++) {
                    if(arr1[i] + arr1[j] == s) {
                        System.out.print("Pair of elements can make the given sum by the value of index " + i + " and " + j);
                        return;
                    }
                        }
                       }
            System.out.print("No Pair can make the given sum.");
        }
        public static void main(String[] args) {
            int[] arr1 = {6, 8, 4, -5, 7, 9};
            int s = 15;
            System.out.print("The given array : ");
            int n = (int)arr1.length;
            for(int i = 0; i <= n - 1; i++) {
                System.out.print(arr1[i] + "  ");
            }
            System.out.println("\nThe given sum : " + s);
            System.out.println();
            checkForSum(arr1, n, s);
        }
    }

