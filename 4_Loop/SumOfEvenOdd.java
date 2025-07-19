import java.util.*;

public class SumOfEvenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int evenSum = 0, oddSum = 0;
        int choice;
        
        do{
            System.out.println("Enter a numbers");
            int num = sc.nextInt();
            
            if(num%2==0){
                evenSum+=num;
            }else{
                oddSum+=num;
            }
            System.out.println("Sum of even num : "+(evenSum));
            System.out.println("Sum of odd num : "+ (oddSum));
            System.out.println("If you want to continue enter 1 for yes or enter any digit for no.");
             choice = sc.nextInt();
        }while(choice == 1);

        System.out.println("Program Ended");
    }
}
