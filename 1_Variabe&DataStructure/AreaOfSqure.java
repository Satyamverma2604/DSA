import java.util.*;
public class AreaOfSqure {

    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side of squre");
        int side = sc.nextInt();
        int area = side*side;

        System.out.println("The area of squre is : ");
        System.out.println(area);
    }
     
}