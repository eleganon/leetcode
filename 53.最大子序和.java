/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int result = nums[0];
        for(int num:nums){
            if(sum >= 0){
                sum += num;
            }
            else{
                sum = num;
            }
            result = Math.max(result, sum);
        }
        return result;
    }
}

