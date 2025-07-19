
import java.util.Scanner;

public class reverseDigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int reversed = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reversed = (reversed * 10) + lastDigit;
            num /= 10;

        }
        System.out.println("The reversed num is : " + (reversed));
    }

}
