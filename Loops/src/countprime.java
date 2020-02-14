public class countprime {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (findprime(i)) {
                ++count;
                System.out.println(" number " + i + " is a prime number. ");
                if (count == 3) {
                    System.out.println("exiting from loop");
                    break;
                }
            }
        }
    }
    public static boolean findprime( int n){
            if (n == 0) {
                return false;
            }
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

