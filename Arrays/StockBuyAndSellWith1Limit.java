import java.util.Scanner;

public class StockBuyAndSellWith1Limit {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int minProfit = prices[0];
        int totalProfit = 0;
        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                totalProfit = Math.max(totalProfit, prices[i] - minProfit);
            } else {
                minProfit = Math.min(minProfit, prices[i]);
            }
        }
        return totalProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter the prices of the stock for each day: ");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        System.out.println("The maximum profit that can be made is: " + maxProfit(prices));
        sc.close();
    }
}