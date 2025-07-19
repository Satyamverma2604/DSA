import java.util.*;

public class areaOfCircle {

    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of the circle");
        int radius = sc.nextInt();
        float area = 3.14f*radius*radius;
        System.out.println("Area of cirle is : ");
        System.out.println(area);
    }
}