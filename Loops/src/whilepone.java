public class whilepone {
    public static void main(String[] args) {
        int count=0;
        while(count!=6)
        {
            System.out.println(" value of count is = " + count);
            count++;
        }
        count = 0;
        while(true)
        {
            if(count==6)
            {
                break;
            }
            System.out.println("value is= " + count);
            count++;

        }
    }
}
