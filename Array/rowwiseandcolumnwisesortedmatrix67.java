package p1;

public class rowwiseandcolumnwisesortedmatrix67 {
    public static int searchElement(int[][] arr2d, int n, int x) {
        int i = 0, j = n - 1;
        while(i < n && j >= 0) {
            if(arr2d[i][j] == x) {
                System.out.print("\nThe element Found at the position in the matrix is:  " + i + ", " + j);
                return 1;
            }
            if(arr2d[i][j] < x) {
                j--;
            } else {
                i++;
            }
        }
        System.out.print("\nThe given element not found in the 2 2 array.");
        return 0;
    }
    public static void main(String[] args) {
        int[][] arr2d = {{15, 23, 31, 39}, {18, 26, 36, 43}, {25, 28, 37, 48}, {30, 34, 39, 50}};
        int v;
        v = 37;
        System.out.println("The given array in matrix form is :  ");
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(arr2d[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.print("The given value for searching is: " + v);
        searchElement(arr2d, 4, v);
    }
}
