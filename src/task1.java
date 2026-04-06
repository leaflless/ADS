import java.util.Scanner;
public class task1 {
    public static int sq(int n) {
        if (n == 1) return 1;
        return n * n + sq(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int result = sq(n);
        System.out.println("result: " + result);
    }
}