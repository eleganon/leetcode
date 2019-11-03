import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> num = new HashSet<>();
        for(int i = 0;i < nums.length;i ++){
            if(num.contains(nums[i])){
                return true;
            }
            num.add(nums[i]);
        }
        return false;
    }
}

