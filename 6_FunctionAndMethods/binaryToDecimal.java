
public class binaryToDecimal {

    public static void ConDecimal(int n) {
        int num = n;
        int decimal = 0;
        int pow = 0;
        while (n > 0) {
            int lastDegit = n % 10;
            decimal += lastDegit * Math.pow(2, pow);
            pow++;
            n /= 10;
        }
        System.out.println("The decimal value of " + num + " is : " + decimal);
    }

    public static void main(String args[]) {
        ConDecimal(101);
        ConDecimal(10101);
        ConDecimal(10110);
    }
}
