package p1;

public class sumuppertriangularelementsmatrix74 {
    public static void main(String[] args) {
        int r, c, n, sum = 0;
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        r = c = n = 3;
        System.out.println("The given array is :  ");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(arr1[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.print("The elements being summed of the upper triangular matrix are: ");
        for(int r2 = 0; r2 < r; r2++) {
            for(int c2 = 0; c2 < c; c2++) {
                if(r2 < c2) {
                    System.out.print(arr1[r2][c2] + "  ");
                    sum += arr1[r2][c2];
                }
            }
        }
        System.out.print("\nThe Sum of the upper triangular Matrix Elements are: " + sum);
    }
}
