import java.util.Scanner;

public class hollowRectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int lng = sc.nextInt();
        System.out.println("Enter width of rectange");
        int wid = sc.nextInt();

        for (int i = 1; i <= wid; i++) {
            for (int j = 1; j <= lng; j++) {

                if (i == 1 || i == wid || j == 1 || j == lng) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
