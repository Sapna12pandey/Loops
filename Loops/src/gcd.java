public class gcd {
    public static void main(String[] args) {
        int b = getGreatestCommonDivisor(25, 5);
        System.out.println(b);

    }

    public static int getGreatestCommonDivisor(int a, int b) {
        int gcd = 0;
        if (a < 10 || b < 10) {
            return -1;
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
}