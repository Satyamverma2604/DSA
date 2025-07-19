
public class bubbleSort {

    public static void bubbleSort(int arr[]) {
        int swap = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swap++;
                }
            }
            if (swap == 0) {
                System.out.println("The data is already shorted.");
                return;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The number of swap is : " + swap);

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 5, 3, 4, 6 };
        bubbleShort(arr);
    }

}
