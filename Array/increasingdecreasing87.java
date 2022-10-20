package p1;

public class increasingdecreasing87 {
    public static int firstIncreDecre(int[] arr1, int n) {
        int maxEle = arr1[0];
        for(int i = 1; i < n; i++) {
            if(arr1[i] > maxEle) {
                maxEle = arr1[i];
            }
        }
        return maxEle;
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 7, 12, 25, 4, 57, 27, 44}; //fill the array by increasing and decreasing elements
        int n = (int)arr1.length;
        System.out.println("The given array is:  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        System.out.print("The maximum element which is increasing then decreasing is: " + firstIncreDecre(arr1, n) + " ");
    }
}
