package p1;

public class Toplefttobottomright85 {
    public static int pathCounting(int m, int n) {
        int[][] ctr = new int[m][n];
        for(int i = 0; i < m; i++) {
            ctr[i][0] = 1;
        }
        for(int j = 0; j < n; j++) {
            ctr[0][j] = 1;
        }
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                ctr[i][j] = ctr[i - 1][j] + ctr[i][j - 1];
            }
        }
        return ctr[m - 1][n - 1];
    }
    public static void main(String[] args) {
        int p, q;
        p = 4;
        q = 4;
        System.out.println("The size of matrix is : " + p + ", " + q);
        System.out.println("The all possible paths from top left to bottom right is: " + pathCounting(p, q) + " ");
    }
}
