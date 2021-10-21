import java.util.Scanner;

// wap to check for loop year.

public class Question5 {
    public static void main(String[] args) {

        int year = 2016;
        /*
        Different way to find leap year.

        if((year%400 == 0) || (year%4 == 0 && year%100!=0))
        {
        System.out.println("Leap Year");
        }
        else
        {
        System.out.println(Not a Leap Year);
        }
         */

        if(year%4 == 0)
        {
            if(year%100 == 0)
            {
                if(year%400 == 0)
                {
                    System.out.println("Leap year");
                }
                else
                {
                    System.out.println("Not a Leap year");
                }
            }
            else
            {
                System.out.println("Leap year");
            }
        }
        else
        {
            System.out.println("Not a Leap year");
        }
    }
}
