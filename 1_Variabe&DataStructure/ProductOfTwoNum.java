import java.util.*;
public class ProductOfTwoNum {

    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int Product = a*b;
        System.out.print("The product is : ");
        System.out.println(Product);
    }
}