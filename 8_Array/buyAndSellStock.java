public class buyAndSellStock {

    public static void buyAndSellStock(int arr[]) {
        int buy = arr[0];
        int maxProfit = 0;
        for (int i = 1; i < arr.length; i++) {
            int sell = arr[i];
            if (buy < sell) {
                int profit = sell - buy;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buy = arr[i];
            }

        }
        System.out.println("The maximum profit is : " + maxProfit + " And the minimum buy price is : " + buy);
    }

    public static void main(String args[]) {
        int price[] = { 7, 5, 3, 6, 4, 8, 9 };
        buyAndSellStock(price);
    }
}
