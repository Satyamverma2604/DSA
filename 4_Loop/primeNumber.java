import java.util.Scanner;

public class primeNumber {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int i =2;

        if( num <= 0){
            System.out.println("Enter a positive number");
            return;
        }
        if(num ==1){
            System.out.println("Not a prime number");
            return;
        }
        for(; i<=num-1;i++){
            if( num%i==0){
                System.out.println("Not a prime number");
                break;
            }
        }
        if(num==i){
            System.out.println("It's a Prime number");
        }

    }
    
}
