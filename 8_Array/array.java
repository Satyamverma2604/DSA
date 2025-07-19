
public class array {

    public static void main(String args[]) {
        int ar1[] = new int[5];
        // int ar2 [] = int [6]; required new keyword to allocate memory.
        int arr[] = { 1, 2, 3, 4, 5, 7 };
        System.out.println(arr.length);
        arr[5] = 6;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(ar1.length);
        System.out.println(ar2.length);
    }
}