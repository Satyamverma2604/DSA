/*  question: program will keep asking for a input and will print it 
 untill unless user will give 10's multiple as an input */

import java.util.Scanner;

public class checkMultipleof10 {
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number ");
    int num = sc.nextInt();

    while (true) {
        if(num%10==0){
            System.out.println("Good! Number is 10's multiple");
            break;
        }
        System.out.println("Number is not a multiple of 10");
        System.out.println("Enter a number again");
        num = sc.nextInt();
    }
 }   
}
