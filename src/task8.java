import java.util.Scanner;

public class task8 {

    public static void generate(int n, int k, String current) {
        if (current.length() == n) {
            System.out.println(current.replaceAll("", " ").trim());
            return;
        }
        for (int i = 1; i <= k; i++) {
            generate(n, k, current + i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n and k: ");
        int n = sc.nextInt();
        int k = sc.nextInt();

        generate(n, k, "");
    }
}