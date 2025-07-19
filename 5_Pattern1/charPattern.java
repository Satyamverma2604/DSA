import java.util.Scanner;

public class charPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 to 5 ");
        int num = sc.nextInt();

        char ch='A';
        if(num>=1 && num<=5){

            for(int col=1;col<=num;col++){
                for(int cha=1;cha<=col;cha++){
                    System.out.print(ch);
                    ch++;
                }System.out.println();
            }

        }else{
            System.out.println("You entered a invalid number.");
        }
    }
}
