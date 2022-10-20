package p1;

public class sumequaltogivennumber78 {
    public static void sumOfFourElements(int[] arr1, int size, int sum) {
        System.out.println("The elements are:  ");
        for(int i = 0; i < size - 3; i++) {
            for(int j = i + 1; j < size - 2; j++) {
                for(int k = j + 1; k < size - 1; k++) {
                    for(int l = k + 1; l < size; l++) {
                        if(arr1[i] + arr1[j] + arr1[k] + arr1[l] == sum) {
                            System.out.println(arr1[i] + ", " + arr1[j] + ", " + arr1[k] + ", " + arr1[l]);
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("No such elements found for the given sum.");
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 7, 1, 9, 15, 14, 6, 2, 5, 7};
        int sumGiven = 37;
        int n = (int)arr1.length;
        System.out.println("The given array is:  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        sumOfFourElements(arr1, n, sumGiven);
    }
}
