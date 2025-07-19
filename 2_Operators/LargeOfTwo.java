import java.util.*;
public class LargeOfTwo {
    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int Num1= sc.nextInt();
        System.out.println("Enter Second number");
        int Num2= sc.nextInt();

        if(Num1>Num2){
            System.out.println("Bigger of these two number is : " + Num1);

        } else{
            System.out.println("Bigger of these two number is : " + Num1);
        }
    }
}
