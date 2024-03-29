/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minprice = Integer.MAX_VALUE;
        for(int i = 0;i < prices.length;i ++){
            if(prices[i] < minprice){
                minprice = prices[i];
            }
            else if(prices[i] - minprice > maxprofit){
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }
}

