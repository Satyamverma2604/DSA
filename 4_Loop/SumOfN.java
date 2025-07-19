// package Day-8_Loop
import java.util.*;
public class SumOfN {
    
    public static void main(String args [] ){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        int sum = 0;
        int i =1;
        while(i<=num){
            sum+=i;
            System.out.println(sum);
            i+=1;
        }
    }
}
