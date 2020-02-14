public class prim {
    public static void main(String[] args) {
        boolean a = findprime(6);
        System.out.println(a);
    }

    public static boolean findprime(int n) {

        if (n == 0) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
