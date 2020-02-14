public class printfactor {
    public static void main(String[] args) {
        printFactors(6);

    }
    public static void  printFactors(int num)
    {
        if(num<0)
        {
            System.out.println("invalid value");
        }
        else{
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
