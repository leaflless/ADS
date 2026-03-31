import java.util.Scanner;

public class task7 {

    public static void spiral(int[][] a, int top, int bottom, int left, int right, int num) {
        if (top > bottom || left > right) return;

        for (int i = left; i <= right; i++) a[top][i] = num++;
        for (int i = top + 1; i <= bottom; i++) a[i][right] = num++;
        for (int i = right - 1; i >= left; i--) a[bottom][i] = num++;
        for (int i = bottom - 1; i > top; i--) a[i][left] = num++;

        spiral(a, top + 1, bottom - 1, left + 1, right - 1, num);
    }

    public static void printMatrix(int[][] a) {
        for (int[] row : a) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];
        spiral(a, 0, n - 1, 0, n - 1, 1);
        printMatrix(a);
    }
}
