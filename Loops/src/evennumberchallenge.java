class evennumberchallenge {
    public static void main(String[] args) {
        int a = 4, c = 20, count = 0;
        boolean b = iseven(5);
        System.out.println(b);
        while (a <= c) {
            a++;
            if (!iseven(a)) {
                    continue;
                }
            count++;
            if(count>=5){
                break;
            }
            System.out.println("even numbers are=" +a);
            }
        System.out.println("total numbers are=" + count);
            }
        public static boolean iseven ( int a){
            if (a >= 0 && a % 2 == 0) {
                return true;
            }
            return false;
        }
    }


