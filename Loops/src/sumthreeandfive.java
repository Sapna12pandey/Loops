class sumthreeandfive {
        public static void main(String args[])
        {
            int count=0,sum=0;
            for(int i=1;i<=1000;i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    ++count;
                    System.out.println(i + " is divided by 3 and also with 5. ");
                    if (count == 5) {
                        System.out.println("exiting from the loop");
                        break;
                    }
                    sum = sum + i;
                    System.out.println("sum is=" + sum);
                }
                }
            }

  }

