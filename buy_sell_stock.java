/*********
  You are given an integer array prices where prices[i] is the price of NeetCoin on the ith day.

You may choose a single day to buy one NeetCoin and choose a different day in the future to sell it.

Return the maximum profit you can achieve. You may choose to not make any transactions, in which case the profit would be 0.

Example 1:

Input: prices = [10,1,5,6,7,1]

Output: 6
Explanation: Buy prices[1] and sell prices[4], profit = 7 - 1 = 6.

Example 2:

Input: prices = [10,8,7,5,2]

Output: 0
  **************/
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        if(prices.length<=1)
          return 0;
        int buy = prices[0];
        for(int i=1;i<prices.length;i++){
            profit = Math.max(prices[i]-buy,profit);
            buy = Math.min(buy,prices[i]); 
        }
        return profit;
    }
}
