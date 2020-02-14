public class NUMBERTOWORDS {
    public static void main(String[] args) {
        numberToWords(456);
        numberToWords(-3);
        numberToWords(100);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int numDigits = getDigitCount(number);
            int sum = reverse(number);
            int ext = 0;
            while (numDigits > 0) {
                ext = sum % 10;
                sum /= 10;
                numDigits -= 1;
                switch (ext) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;

                    case 3:
                        System.out.println("Three");
                        break;

                    case 4:
                        System.out.println("Four");
                        break;

                    case 5:
                        System.out.println("Five");
                        break;

                    case 6:
                        System.out.println("Six");
                        break;

                    case 7:
                        System.out.println("Seven");
                        break;

                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("wrong choice");
                }
            }
        }
    }

    public static int reverse(int number) {
        int sum = 0;
        int digitCountSq = (int) Math.pow(10, getDigitCount(number) - 1);
        while (number>0) {
            sum += (number % 10) * (digitCountSq);
            number /= 10;
            digitCountSq /= 10;
        }
        return sum;
    }

    public static int getDigitCount(int number) {
        int digit = 0;
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            digit = 1;
        }
        while (number > 0) {
            number /= 10;
            digit += 1;
        }
        return digit;
    }
}