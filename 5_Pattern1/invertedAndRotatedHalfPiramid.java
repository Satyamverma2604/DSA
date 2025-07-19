import java.util.Scanner;

public class invertedAndRotatedHalfPiramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int space = 1; space <= num - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.err.println();
        }

    }

}