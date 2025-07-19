import java.util.*;

class helper {
    public static int ProNum(int num1, int num2) {

        int product = num1 * num2;
        return product;
    }
}

public class productNum {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        int product = helper.ProNum(num1, num2);
        System.out.println("The product is : " + product);

    }
}
