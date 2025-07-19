//Bill of three item with 18% GST
import java.util.*;
public class Bill {

    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of pencil");
        int pencil = sc.nextInt();
        System.out.println("Enter the price of pen");
        int pen = sc.nextInt();
        System.out.println("Enter the price of eraser");
        int eraser = sc.nextInt();
        float Total = pencil+pen+eraser;
        float GST = Total*18/100;
        Total = (float) GST+Total;

        System.out.println("Total payble amount with GST is : ");
        System.out.println(Total);


    }
}