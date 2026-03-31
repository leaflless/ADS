import java.util.Scanner;

public class task6 {

    public static void reverseStrings(int n, Scanner sc) {
        if (n == 0) return;
        String s = sc.nextLine();
        reverseStrings(n - 1, sc);
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Enter strings:");
        reverseStrings(n, sc);
    }
}