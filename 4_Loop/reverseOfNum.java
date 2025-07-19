package Day_8_Loop;

import java.util.Scanner;

public class reverseOfNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        while(num>0){
           int lastDigit = num%10;
            System.out.print(lastDigit);
            num/=10;
        }
    }
}
