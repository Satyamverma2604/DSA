import java.util.*;
public class Income{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary");
        int income = sc.nextInt();

        if(income < 500000){
            
            System.out.println("The Tax is : " + 0  + " Rupess");
        }else if ( income > 500000 && income < 1000000){
            System.out.println("The Tax is : " + (income*20)/100  + " Rupess");
            
        }else {
            System.out.println("The Tax is : " + (income*30)/100  + " Rupess");

        }


    }
}
