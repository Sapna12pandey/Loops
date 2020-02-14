public class palindrome {
    public static void main(String[] args) {
        boolean b=isPalindrome(-111);
        System.out.println(b);
    }
    public static boolean isPalindrome(int num)
    {
        int sum=0,dummy;
        dummy=num;
       /* if(num<0)
        {
            return false;
        }*/
        while(num!=0)
        {
            int di=num%10;
            sum=(sum*10)+di;
            num=num/10;
        }
        if(sum==dummy)

        {
            return true;
        }
        return false;
    }
}
