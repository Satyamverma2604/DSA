package Day_8_Loop;

import java.util.Scanner;

public class doWhileLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int i = 1;
        do{
            System.out.println("I'm Satya : " + i );
            i+=1;
        }while(i<=num);
    }
}
