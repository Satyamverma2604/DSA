
import java.util.*;
public class continueStatement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        while(true){
            if(num%10==0){
                System.out.println("it's multiple of 10!!!  Try another number.");
                num = sc.nextInt();
                continue;
            }
            System.out.println("The number is : " +  num);
            System.out.println("Enter another number ");
            num = sc.nextInt();
        }

    }    
}
