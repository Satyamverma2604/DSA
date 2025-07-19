import java.util.Scanner;

public class sumOfDigit {
    public static void sumOfDigit(int n) {
        int myNum = n;
        int sum = 0;
        while (n > 0) {
            int lastDegit = n % 10;
            sum += lastDegit;
            n /= 10;
        }
        System.out.println("The sum of all digits of num " + myNum + " is : " + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        sumOfDigit(n);
    }
}
