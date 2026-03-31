public class task3 {

    public static int sumN(int n) {
        if (n == 1) return 1;
        return n + sumN(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of first " + n + " numbers = " + sumN(n));
    }
}