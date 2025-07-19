import java.util.*;

public class functions {
    public static void printHello() {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
    }

    public static int calSum(int num1, int num2) {

        int Sum = num1 + num2;
        return Sum;
    }

    public static int[] swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        int swapNUm[] = { a, b };
        return swapNUm;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // printHello();
        // System.out.println("Second time running funtion");
        // printHello();

        // code for CalSum
        // System.out.println("Enter first number");
        // int a = sc.nextInt();
        // System.out.println("Enter second number");
        // int b = sc.nextInt();

        // int result = calSum(a, b);
        // System.out.println("The result is : " + result);

        // Code for swap
        // System.out.print("Enter a : ");
        // int a = sc.nextInt();
        // System.out.print("Enter b : ");
        // int b = sc.nextInt();
        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println("The value of a is : " + a + " and the value of b is : " +
        // b);

        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        // System.out.println("The value of a is : " + swap(a, b)[0]);
        // System.out.println("The value of b is : " + swap(a, b)[1]);

        int result[] = swap(a, b);
        System.out.println("The value of a is : " + result[0] + " and the value of b is : " + result[1]);
    }
}
