import java.math.*;
import java.util.Random;

/*a. Math.min( )
b. Math.max( )
c. Math.sqrt( )
d. Math.pow( )
e. Math.avg( )
f. Math.abs( ) */

public class mathFunction {

    public static void main(String args[]) {
        System.out.println(Math.min(5, 6));
        System.out.println(Math.max(8, 2));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.abs(-4654));
        System.out.println(Math.abs(-56.55));
        System.out.println(Math.random());
        System.out.println((int) (Math.random() * 10) + 1);
        Random random = new Random();
        int randomNum = random.nextInt(10 + 1) + 20;
        System.out.println(randomNum);
        // random number between 5 to 15
        {
            int randomNums = (int) (Math.random() * 10) + 6;
            System.out.println("The random number between 5 to 15 is : " + randomNums);
        }
    }
}