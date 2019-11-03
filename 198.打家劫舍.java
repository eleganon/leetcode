/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */
class Solution {
    public int rob(int[] nums) {
        int preMax = 0;
        int curMax = 0;
        for(int i: nums){
            int temp = curMax;
            curMax = Math.max(preMax + i, curMax);
            preMax = temp;
        }
        return curMax;
    }
}

