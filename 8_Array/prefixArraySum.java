public class prefixArraySum {
    public static void prefixArraySum(int arr[]) {
        int prefixSum[] = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        int largest = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = start; j < arr.length; j++) {
                int end = j;
                currentSum = start == 0 ? prefixSum[end] : prefixSum[end] - prefixSum[start - 1];

                if (largest < currentSum) {
                    largest = currentSum;
                }
            }
        }
        System.out.println("The lagest sum of subArray is : " + largest);
    }

    public static void main(String args[]) {
        int arr[] = { 1, -2, 6, -1, 3 };
        prefixArraySum(arr);
    }
}
