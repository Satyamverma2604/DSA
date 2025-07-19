import java.util.*;

public class AverageofThree {

    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num");
        int a = sc.nextInt();
        System.out.println("Enter second num");
        int b = sc.nextInt();
        System.out.println("Enter third num");
        int c = sc.nextInt();
        float Avg = (float)(a+b+c)/3;
        System.out.println("The average is : ");
        System.out.println(Avg);


    }
}
