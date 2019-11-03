/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 0;i < prices.length - 1;i ++){
            if(prices[i + 1] > prices[i]){
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }
}

