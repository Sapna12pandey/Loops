public class flourpackproblem {
    public static void main(String[] args) {
        boolean b=canPack(-2,2,11);
        System.out.println(b);

    }
    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
     if(bigCount< 0 || smallCount< 0 || goal< 0)
        {
            return false;
        }
     else
     {
         bigCount=bigCount*5;
         smallCount=smallCount*1;
         goal=bigCount+smallCount;
         if(goal<bigCount || goal<smallCount)
         {
             return false;
         }
         else if(bigCount==0 )
         {
           return false;
         }
         else if(goal>=(bigCount+smallCount))
         {
             return true;
         }
         else{
             return true;
         }
     }
    }
}
