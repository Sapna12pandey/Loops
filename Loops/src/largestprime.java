public class largestprime
{
    public static void main(String args[])
    {
        System.out.println("Largest prime factor of number '%d' is %d %n" +getLargestPrime(-5));
      //  System.out.println("highest prime factor of number '%d' is %d %n" largestPrimeFactor(15));
       // System.out.println("Biggest prime factor of number '%d' is %d %n", 392832, largestPrimeFactor(392832));
        //System.out.println("Largest prime factor of number '%d' is %d %n", 1787866, largestPrimeFactor(1787866));
    }
    public static int getLargestPrime(int number)
    {
        if(number<0)
        {
            return -1;
        }
        else
        {
            int i;
            int copyOfInput = number;
            for (i = 2; i <= copyOfInput; i++)
            {
                if (copyOfInput % i == 0)
                { copyOfInput /= i;
                    i--;
                }
            }
            return i;
        }
    }
}