public class selectionSort {

    public static void selectionSort(int arr[]) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    minPos = j;
                }
            }
            // Swap
            int temp = arr[minPos];
            arr[i] = arr[j];
            arr[j] = arr[minPos];
        }
    }

    public static void main(String args[]) {

        int arr[] = { 2, 3, 4, 1, 5 };

    }

}
