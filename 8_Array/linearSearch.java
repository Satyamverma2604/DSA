public class linearSearch {

    public static int linearSearch(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 4, 5, 6, 7, 8, 9, 0 };
        int key = 3;

        // int index = linearSearch(arr, key);
        // if (index == -1) {
        // System.out.println("Not found");
        // } else {
        // System.out.println("The number is found at index no : " + index);
        // }

        String menu[] = { "Samosa", "edli", "dhosa", "sandwitch", "pizza" };
        String mydish = "pizza";

        int index = linearSearch(menu, mydish);
        if (index == -1) {
            System.out.println("Not found in menu");
        } else {
            System.out.println("The dish is found at index no : " + index);
        }
    }
}
