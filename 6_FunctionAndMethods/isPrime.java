
public class isPrime {

    public static boolean Prime(int n) {
        boolean isPrime = true;

        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n - 1; i++) {// we can optimized it by run loop till sqrt(n)
            if (n % i == 0) { // complitely divided
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String args[]) {
        System.out.println(Prime(2));
        System.out.println(Prime(4));
        System.out.println(Prime(5));
    }
}
