import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter Operator");
        char Operator = sc.next().charAt(0);
        System.out.println("Enter second number");
        int num2 = sc.nextInt(); 
        
        switch (Operator) {
            case '+':  System.out.println("The answer is " + (num1 + num2));
        
                break;
            case '-': System.out.println( "The answer is " + (num1 - num2));
        
                break;
            case '*':  System.out.println("The answer is " + (num1 * num2));
        
                break;
            case '/': System.out.println("The answer is " + (num1 / num2)); 
        
                break;
            case '%': System.out.println( "The answer is " + (num1 % num2));
        
                break;
        
            default: System.out.println("Wrong Operator"); 
                break;
        }
        
    }
}
