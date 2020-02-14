import java.util.*;
public class SCANNER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year of birth:");
        boolean hasNextInt = sc.hasNextInt();
        if (hasNextInt) {
            int dob = sc.nextInt();
            System.out.println("enter the name:");
            String name = sc.next();
            int age = 2020 - dob;
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " , and your age is " + age);
            } else {
                System.out.println("invalid entered age");
            }
        }
        else
            {
                System.out.println("unable to pass year of birth");
            }
        }
    }

