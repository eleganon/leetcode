import java.util.HashMap;
import java.util.Map;



/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 求众数
 */
class Solution {
    public int majorityElement(int[] nums) {
        Map <Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i ++){
            if(map.containsKey(nums[i])){
                continue;
            }
            int count = 1;
            for(int j = i + 1;j < nums.length;j ++){
                if(nums[j] == nums[i]){
                    count ++;
                }
            }
            map.put(nums[i],count);
            }
            int maxcount = 0;
            for(Integer value:map.values()){
                if(value > maxcount){
                    maxcount = value;
                }
        }
        int major = 0;
        for(Map.Entry<Integer,Integer> en:map.entrySet()){
            if(maxcount == en.getValue()){
                major = en.getKey();
            }
        }
        return major;

    }
}

