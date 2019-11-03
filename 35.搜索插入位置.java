/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        // int nums_length = nums.length;
        // int low = 0;
        // int high = nums_length-1;
        // int mid = 0;
        // if(nums[nums_length-1] < target){
        //     return nums_length;
        // }
        // while(low <= high){
        //     mid = (low + high)/2;
        //     if(nums[mid] == target){
        //         return mid;
        //     }
        //     else if(nums[mid] > target){
        //         high = mid -1; 
        //     }
        //     else {
        //         low = mid + 1;
        //     }
        // }
        // return low;
        int len = nums.length;
        int left = 0;
        int right = len;
        if(len == 0){
            return 0;
        }
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                right = mid;
            }
            else{
                left =mid + 1;
            }
        }
        return left;
    }
}


