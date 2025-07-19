import java.util.Scanner;

public

class FLOYDsTranglePattern {
    public static void main(String arg[]) {
        int num = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int col = 1; col <= n; col++) {
            for (int number = 1; number <= col; number++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }

    }

}