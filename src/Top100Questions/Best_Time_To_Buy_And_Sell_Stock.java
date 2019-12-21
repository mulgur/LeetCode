package Top100Questions;

public class Best_Time_To_Buy_And_Sell_Stock {
	/*
	 * Say you have an array for which the ith element is the price of a given stock
	 * on day i.
	 * 
	 * If you were only permitted to complete at most one transaction (i.e., buy one
	 * and sell one share of the stock), design an algorithm to find the maximum
	 * profit.
	 * 
	 * Note that you cannot sell a stock before you buy one. 
	 * 
	 * Example 1:
	 * Input: [7,1,5,3,6,4]   ->  [7,3,9,1,2]
	 * Output: 5 
	 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. Not 7-1 = 6, 
	 * as selling price needs to be larger than buying price.
	 */

	public static int maxProfit(int[] prices) {
		int maxCurrent = 0;
		int maxGlobal = 0;
		for (int i = 1; i < prices.length-1; i++) {
			maxCurrent = Math.max(0, maxCurrent+=prices[i]-prices[i-1]);
			maxGlobal = Math.max(maxGlobal, maxCurrent);
		}
		return maxGlobal;
       
    }

	public static void main(String[] args) {
		int[] prices= {7,1,5,3,6,4};
		int[] prices2= {7,6,4,3,1};
		System.out.println(maxProfit(prices));
		System.out.println(maxProfit(prices2));

	}

}
