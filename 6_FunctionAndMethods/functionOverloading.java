
public class functionOverloading {

    // Sum of two number

    public static int sum(int a, int b) {
        return a + b;
    }

    // Sum of two number
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Sum of two float number
    public static float sum(float a, float b) {
        return (a + b);
    }

    public static void main(String args[]) {
        System.out.println(sum(5, 6));
        System.out.println(sum(5, 5, 5));
        System.out.println(sum(5.2f, 4.9f));
    }

}
