public class sumdigitchallenge {
    public static void main(String[] args) {
        int a=sumd(313);
        System.out.println(a);
    }
    public static int sumd(int num) {
        int sum=0;
        if(num<10)
        {
            return -1;
        }

        while(num>0){
            int di = num % 10;
            sum = sum + di;
            num = num / 10;

        }
        return sum;
    }
}
