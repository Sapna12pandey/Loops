public class PERFECT {
    public static void main(String[] args) {
        boolean a=printFactors(28);
        System.out.println(a);

    }
    public static boolean  printFactors(int num)
    {
        int sum=0;
        int dummy=num;
        if(num<1)
        {
            return false;
        }
        else {
            for (int i = 1; i <= num/2; i++) {
                if (num % i == 0) {
                    sum = sum + i;
                }
            }
                    System.out.println(sum);
        }
            if(dummy==sum)
            {
                return true;
            }
            else
            {
                return false;
            }

        }
    }
