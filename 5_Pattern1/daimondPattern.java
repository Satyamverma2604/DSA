import java.util.Scanner;

public class daimondPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a odd number");
        int n = sc.nextInt();
        // first half
        for (int col = 1; col <= n; col++) {
            // for space
            for (int space = 1; space <= (n - col); space++) {
                System.out.print(" ");
            }
            // for star
            for (int star = 1; star <= (2 * col) - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // second half

        for (int col = 1; col <= n; col++) {
            // for space
            for (int space = 1; space <= col - 1; space++) {
                System.out.print(" ");
            }
            // for star
            for (int star = 1; star <= 2 * ((n + 1) - col) - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
