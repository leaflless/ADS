import java.util.Scanner;
public class task4 {
    public static int p(int b, int n) {
        if (n == 0) return 1;
        return p(b, n - 1) * b;
    }
    public static int sum(int b, int n) {
        if (n == 0) return 1;
        return p(b, n) + sum(b, n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.println(sum(b, n));
    }
}