import java.util.*;

public class allPrimeNum {

    public static boolean isPrime(int n) {
        boolean isPrime = true;

        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return isPrime;

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to get all fist prime number till here : ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i) == true) {
                System.out.println("Prime Num : " + i);
            }
        }
    }

}