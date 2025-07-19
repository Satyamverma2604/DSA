import java.util.*;

public class SumOfTwoNum {

     public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        
        int sum = a+b;

        System.out.print("The sum is : ");
        System.out.println(sum);
     }
}