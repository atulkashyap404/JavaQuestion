import java.util.Scanner;

// wap to check for even or odd.
public class Question4 {
    public static void main(String[] args) {
       /*
       when we want to take user input then use below code.
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       */
        int num = 4;
        if(num%2 == 0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }
}
