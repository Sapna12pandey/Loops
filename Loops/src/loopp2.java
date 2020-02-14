 class loopp2 {
    public static void main(String[] args) {
        getintrest(1890.87,2);
       for (int i = 2; i <= 8; i++) { //in ascendeng
            double amount=1890.87;
            System.out.println(amount + " * " + i + " divided by 100 = " + String.format(" %2f. " ,getintrest(1890.87, i)));
        }
        for (int i = 8; i >1; i--) {
            double amount=1890.87;
            System.out.println(amount + " * " + i + " divided by 100 = " + String.format(" %2f. " ,getintrest(1890.87, i)));
        }
    }
        public static double getintrest(double amount,double intrest)
        {
            return ((amount*intrest)/(100));
        }
    }

