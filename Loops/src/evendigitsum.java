public class evendigitsum {
    public static void main(String[] args) {
      int a=  getEvenDigitSum(1235);
        System.out.println(a);
    }

    public static int getEvenDigitSum(int number) {
        int originalNumber = number;
        int digit, sum = 0;
        if(number<0)
        {
            return -1;
        }

        while (number != 0) {
            digit = number % 10;

            if (digit % 2 == 0)
                sum = sum + digit;

            number = number / 10;
        }
     //   System.out.println("Sum of even digits of number " + originalNumber + " is: " + sum);
        return sum;
    }
}

