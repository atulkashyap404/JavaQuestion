import java.util.Scanner;
//  Wap to swap two numbers.
public class Question6 {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        int a = 20,b = 30;
        /*
        System.out.println(a+" Before swap "+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a + " After swap "+ b);

         */
        // swapping the value without using third variable.

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(a+ " Before swapping the value "+b);

    }
}
