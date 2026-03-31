public class task1
{

    public static int sumSquares(int n) {
        if (n == 1) return 1;
        return n * n + sumSquares(n - 1);
    }

    public static void printSquares(int n) {
        if (n == 1) {
            System.out.print("1^2");
            return;
        }
        printSquares(n - 1);
        System.out.print(" + " + n + "^2");
    }

    public static void main(String[] args) {
        int n = 5;

        printSquares(n);
        System.out.println(" = " + sumSquares(n));
    }
}