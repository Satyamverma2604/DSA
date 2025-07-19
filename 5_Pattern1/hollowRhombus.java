import java.util.Scanner;

public class hollowRhombus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        for (int col = 1; col <= n; col++) {
            // for space
            for (int space = 1; space <= (n - col); space++) {
                System.out.print(" ");
            }
            // for star
            for (int star = 1; star <= n; star++) {
                if (col == 1 || col == n || star == 1 || star == n) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
