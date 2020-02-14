 class loopp1 {
     public static void main(String[] args) {
         int i;
         double amount=12890.79d;
         for (i = 2; i <= 8; i++) {
             {
                 double res = ((amount * i) / (100));
                 System.out.println(amount + " *" + i + " divided by 100 is = " + res);
             }
         }
     }
 }
