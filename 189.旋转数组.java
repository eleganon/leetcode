/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 */
class Solution {
    public void rotate(int[] nums, int k) {
    //     int j = 0;
    //     while(j < k){
    //         int temp1 = nums[nums.length - 1];
    //         for(int i = 0;i < nums.length;i ++){
    //             //每次都把原来的数字先存在temp里，他的前一位存在temp1里
    //             int temp = nums[i];
    //             nums[i] = temp1;
    //             temp1 =  temp;
    //          }
    //     j ++;
    // }
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
}
    public void reverse(int [] nums,int begin,int end){
        while(end > begin){
            int temp = nums[begin];
            nums[begin] = nums[end];
            nums[end] = temp;
            end --;
            begin ++;
        }
    }

}

