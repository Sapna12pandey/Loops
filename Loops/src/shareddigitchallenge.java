public class shareddigitchallenge {
    public static void main(String[] args) {
        boolean a = hasSharedDigit(33, 23, 1);
        System.out.println(a);
        boolean b = isValid(32);
        System.out.println(b);

    }

     public static boolean hasSharedDigit(int number1, int number2, int number3) {
         if ((number1 >= 10 && number1 <= 1000) && (number2 >= 10 && number2 <= 1000) && (number3 >= 10 && number3 <= 1000)) {
             int righta = number1 % 10;
             int rightb = number2 % 10;
             int rightc = number3 % 10;
             if(righta==rightb || rightb==rightc || rightc==righta)
             {
                 return   true;
             }

             else {
                 return false;
             }


         }
         return false;
     }


    public static boolean isValid(int i) {
        if (i > 9 && i < 1001) {
            return true;
        }
        return false;
    }
}

