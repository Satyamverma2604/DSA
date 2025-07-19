public class ArithmeticOperators {

    public static void main(String args[]){
         int a = 5;
         int b = 6;

         //Arithmetic Operators

         System.out.println("The sum is : " + (a+b));
         System.out.println("The substract is : " + (a-b));
         System.out.println("The multply is : " + (a*b));
         System.out.println("The divide is : " + (a/b));
         System.out.println("The remender is : " + (a%b));

         //Unary Operators

         b = ++a;
         System.out.println("value of pre-increment is : " + b);
         
         a= 5;
         
         b = a++;
         System.out.println("value of post-increment is : " + b);
    }
}