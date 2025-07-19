import java.util.Scanner;

public class palindromicPattern {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            // for space
            for (int space = 1; space <= (n - row); space++) {
                System.out.print(" ");
            }
            // for 1st quardant digit
            for (int digit = row; digit >= 1; digit--) {
                System.out.print(digit);
            }
            // for 2nd quardant digit
            for (int digit = 2; digit <= row; digit++) {
                System.out.print(digit);
            }
            System.out.println();
        }
    }
}
