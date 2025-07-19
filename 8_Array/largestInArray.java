import java.util.*;

public class largestInArray {

    public static void findLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("The largest num is : " + largest);
    }

    public static void main(String args[]) {
        int numArr[] = { 12, 3, 4, 53, 5, 32, 45, 3, 5, 132 };

        findLargest(numArr);
    }
}
