import java.util.*;
public class TakingInput {

    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first name");
        String firstName = sc.next();
        System.out.println(firstName);
        
        sc.nextLine(); //We are cleanig the buffrer of overleft value of sc.next() function
        
        System.out.println("Enter full name");
        String FullName = sc.nextLine();
        System.out.println(FullName);
        
        System.out.println("Enter num");
        int num = sc.nextInt();
        System.out.println(num);
    }
}