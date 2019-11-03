/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for(int i = 0;i < nums.length;i ++){
            if(nums[i] == 0){
                int temp = i;
                count ++;
                for(int j = i + 1;j <= nums.length - count;j ++){
                    if(nums[j] != 0){
                        nums[i] = nums[j];
                        nums[j] = 0;
                        i = j;
                    }
                }
                i = temp;
            }
        }
    }
}

