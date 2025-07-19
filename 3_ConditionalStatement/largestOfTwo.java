import java.util.*;
public class largestOfTwo {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1");
        int Num1 = sc.nextInt();
        System.out.println("Enter Num2");
        int Num2 = sc.nextInt();

        if(Num1>Num2){
            System.out.println("The greater number is: " + Num1);

        }else{

            System.out.println("The greater number is: " + Num2);
        }

    }
}
