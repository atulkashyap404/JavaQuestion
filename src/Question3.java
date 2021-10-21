// Different way to find the greater b/w three number
public class Question3 {
    public static void main(String[] args) {
       int a = 23, b = 24, c =34;
       if(a>b) {
           if (a > c) {
               System.out.println(" a is greater");
           } else {
               System.out.println("c is greater");
           }
       }
           else if(b>c){
               System.out.println(" b is greater");
           }
           else{
            System.out.println(" c is greater");
       }
    }
}
