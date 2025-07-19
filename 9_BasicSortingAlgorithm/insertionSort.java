public class insertionSort {

    public static void insertionSort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= i + 1; j++) {
                if (arr[i] > arr[j]) {
                    // swap
                    int temp = arr[i];

                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 1, 2, 4, 6, 3 };

        insertionSort(arr);
    }
}
