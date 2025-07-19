import java.util.Scanner;

public class numberPiramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            // for space
            for (int space = 1; space <= (n - row); space++) {
                System.out.print(" ");
            }
            // for number
            for (int number = 1; number <= row; number++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }

    }
}
