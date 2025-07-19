
public class breakStatement {
    public static void main(String args[]){
        int i = 1;
        for(; i<=10; i++){
            if(i==7){
                break;
            }
            System.out.println("The number is : " + i);
        }
        if(i==7){
            System.out.println("Loop is terminated by the break statement");
        }
        System.out.println("I am out of the loop");
    }
}
