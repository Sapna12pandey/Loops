class sumfirstandlastdigit {
    public static void main(String[] args) {
        int a = sumFirstAndLastDigit(-1);
        System.out.println(a);
    }

    public static int sumFirstAndLastDigit(int number) {
        int rev = 0;
        if(number<0)
        {
            return -1;
        }
        int lastDigit = number % 10;
        while (number!=0) {
            int di = number % 10;
            rev = (rev * 10) + di;
            number = number / 10;
        }

        int firstDigit = rev % 10;
        int sum = firstDigit + lastDigit;
        return sum;

    }
}