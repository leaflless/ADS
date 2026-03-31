import java.util.Scanner;
public class task5 {
    public static void reverseNumbers(int n, Scanner sc) {
        if (n == 0) return;
        int x = sc.nextInt();
        reverseNumbers(n - 1, sc);
        System.out.print(x + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        reverseNumbers(n, sc);
    }
}
