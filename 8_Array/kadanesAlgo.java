import java.util.*;

public class kadanesAlgo {

    public static void kandanesAlgo(int arr[]) {
        int currS = 0;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currS += arr[i];
            if (currS < 0) {
                currS = 0;
            }
            largest = Math.max(largest, currS);
        }
        System.out.println("The maximum sum of all subArray is : " + largest);
    }

    public static void main(String args[]) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

        kandanesAlgo(arr);
    }
}
