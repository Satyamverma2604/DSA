public class printSubArray {
    public static void printSubArray(int arr[]) {
        int ts = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int subArraySum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    subArraySum += arr[k];
                }
                if (largest < subArraySum) {
                    largest = subArraySum;
                }
                if (smallest > subArraySum) {
                    smallest = subArraySum;
                }

                System.out.print("       ------>  " + "The sum of this subArray is : " + subArraySum);
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub Array is : " + ts);
        System.out.println("Maximum of sum of all sub Array is :  " + largest);
        System.out.println("Minimun of sum of all sub Array is :  " + smallest);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 5, 6, 7, 8 };

        printSubArray(arr);
    }
}
