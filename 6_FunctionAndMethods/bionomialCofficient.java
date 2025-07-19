import java.util.Scanner;

public class bionomialCofficient {
    public static int Facto(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static int bionomialCofficient(int n, int r) {
        int facto_n = Facto(n);
        int facto_r = Facto(r);
        int facto_nMr = Facto(n - r);

        int cofficient = (facto_n) / (facto_r * facto_nMr);
        System.out.print("The bionomial cofficient is : ");
        return cofficient;
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value of n & r for bionomial cofficient");
        // System.out.println("Enter n :");
        // int n = sc.nextInt();
        // System.out.println("Enter r :");
        // int r = sc.nextInt();

        System.out.println(bionomialCofficient(5, 4));

    }
}
