import java.util.*;

public class decimalToBinary {
    public static void DeciToBinary(int n) {
        int num = n;
        int binary = 0;
        int pow = 0;
        while (n > 0) {
            int remainder = n % 2;
            binary += (remainder * (int) Math.pow(10, pow));
            pow++;
            n /= 2;
        }
        System.out.println("The Binary value of " + (num) + " is : " + (binary));
    }

    public static void main(String args[]) {
        DeciToBinary(7);
        DeciToBinary(5);
        DeciToBinary(16);
    }
}
