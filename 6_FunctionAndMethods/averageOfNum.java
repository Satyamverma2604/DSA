public class averageOfNum {

    public static void Avg(int a, int b, int c) {
        float Avg = ((float) (a + b + c)) / 3;
        System.out.println("The avg of integer value is : " + Avg);
    }

    public static void Avg(float a, float b, float c) {
        float Avg = (a + b + c) / 3.0f;
        System.out.println("The avg  of float value is : " + Avg);
    }

    public static void main(String args[]) {
        Avg(5, 6, 8);
        Avg(5.0f, 6.2f, 7.2f);
    }
}