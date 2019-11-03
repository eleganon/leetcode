/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int high = numbers.length;
        for(int i = 0;i < high - 1;i ++){
            int j = binary(numbers,i + 1, high, target - numbers[i]);
            if(j != -1){
                return new int [] {i + 1,j + 1 };
            }
        }
        return null;
    }
    public int binary(int[] numbers,int low,int high,int target){
        while(low < high){
            int mid = (low + high) / 2;
            if(target == numbers[mid]){
                 return  mid;
            }
            else if(target > numbers[mid]){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return -1;
    }
}

