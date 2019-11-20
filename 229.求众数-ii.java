import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode.cn id=229 lang=java
 *
 * [229] 求众数 II
 *
 * https://leetcode-cn.com/problems/majority-element-ii/description/
 *
 * algorithms
 * Medium (41.73%)
 * Likes:    97
 * Dislikes: 0
 * Total Accepted:    8.1K
 * Total Submissions: 19.5K
 * Testcase Example:  '[3,2,3]'
 *
 * 给定一个大小为 n 的数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。
 * 
 * 说明: 要求算法的时间复杂度为 O(n)，空间复杂度为 O(1)。
 * 
 * 示例 1:
 * 
 * 输入: [3,2,3]
 * 输出: [3]
 * 
 * 示例 2:
 * 
 * 输入: [1,1,1,3,3,2,2,2]
 * 输出: [1,2]
 * 
 */

// @lc code=start
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        List <Integer> result = new ArrayList<>();
        for(int i = 0;i < nums.length;i ++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                
                map.put(nums[i],map.get(nums[i]) + 1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key) > nums.length / 3 && !result.contains(key)){
                result.add(key);
            }
        }
        return result;
    }
}
// @lc code=end

