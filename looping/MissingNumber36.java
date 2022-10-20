package p1;

public class MissingNumber36 {
        public static int pickMissNumber(int[] arr1, int arSize) {
            int sum = 0, n = arSize + 1;
            for(int i = 0; i < arSize; i++) {
                sum = sum + arr1[i];
            }
            return (n * (n + 1)) / 2 - sum;
        }
        public static void main(String[] args) {
            int[] arr1 = {1, 3, 4, 2, 5, 6, 9, 8};
            int ctr = (int)arr1.length;
            System.out.print("The given array is :  ");
            for(int i = 0; i < ctr; i++) {
                System.out.print(arr1[i] + "  ");
            }
            System.out.println();
            System.out.println("The missing number is : " + pickMissNumber(arr1, ctr) + " ");
        }
    }

