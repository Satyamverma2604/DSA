import java.util.Scanner;

public class palindrome {
    public static void checkPalindrome(int n) {
        int myNum = n;
        int reverseNum = 0;
        while (n > 0) {// 51
            int lastDigit = n % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            n /= 10;
        }
        System.out.println(reverseNum);
        if (reverseNum == myNum) {
            System.out.println("You have entered a palindrome number.");
        } else
            System.out.println(myNum + " is not a palindrome number.");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        checkPalindrome(n);
    }
}
