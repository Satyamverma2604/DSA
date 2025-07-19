import java.util.Scanner;

public class butterflyPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an odd number");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // 1st quardant
            for (int star1 = 1; star1 <= i; star1++) {
                System.out.print("*");
            }
            // First half Space
            for (int space1 = 1; space1 <= 2 * (n - i); space1++) {
                System.out.print(" ");
            }
            // 2nd quardant
            for (int star2 = 1; star2 <= i; star2++) {
                System.out.print("*");
            }
            System.err.println();

        }

        for (int k = 1; k <= n; k++) {
            // 3rd quardant
            for (int star3 = 1; star3 <= (n + 1) - k; star3++) {
                System.out.print("*");
            }
            // second half space
            for (int space2 = 1; space2 <= (2 * k) - 2; space2++) {
                System.out.print(" ");
            }
            // 4th quardant
            for (int star4 = 1; star4 <= (n + 1) - k; star4++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
