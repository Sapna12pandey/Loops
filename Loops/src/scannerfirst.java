import java.util.*;
public class scannerfirst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int count=0,sum=0,order=0,num;
      while(true)
      {
          order=count+1;
          System.out.println("enter the *" + order + " number :");
          boolean isAnInt = sc.hasNextInt();
          if(isAnInt)
          {
              num=sc.nextInt();
              count++;
              sum +=num;
              if(count==10)
              {
                  break;
              }

          }
          else
          {
              System.out.println("invalid input");
          }
      }
        System.out.println("sum is=" +sum);
      }
    }