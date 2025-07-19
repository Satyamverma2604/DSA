import java.util.Scanner;

public class invertedHalfPiramidWithNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        for (int col = 1; col <= num; col++) {
            // for number printing
            for (int number = 1; number <= (num - col) + 1; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
