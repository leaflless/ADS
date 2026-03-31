public class task4 {
    public static int sumPowers(int b, int n) {
        if (n == 0) return 1; // b^0 = 1
        return (int)Math.pow(b, n) + sumPowers(b, n - 1);
    }

    public static String buildFormula(int b, int n) {
        if (n == 0) return b + "^0";
        return buildFormula(b, n - 1) + " + " + b + "^" + n;
    }

    public static void main(String[] args) {
        int b = 4;
        int n = 3;

        String formula = buildFormula(b, n);
        int result = sumPowers(b, n);

        System.out.println(formula + " = " + result);
    }
}
