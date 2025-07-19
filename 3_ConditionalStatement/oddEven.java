import java.util.*;;

public class oddEven {
    
    public static void main(String args[]){
        
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        if(num%2==0){
            System.out.println("Given number is even : " + num  );
        }else{
            System.out.println("Given number is odd : " + num );
        }
    }
}
