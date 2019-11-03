import java.util.Arrays;
import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 */
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap <Integer,Integer> map1 = new HashMap<>();
        for(int i = 0;i < nums1.length;i ++){
            if(map1.containsKey(nums1[i])){
                int value = map1.get(nums1[i]) + 1;
                map1.put(nums1[i],value);
            }
            else{
                map1.put(nums1[i], 1);
            }
        }
        HashMap <Integer,Integer> map2 = new HashMap<>();
        for(int i = 0;i < nums2.length;i ++){
            if(map2.containsKey(nums2[i])){
                int value = map2.get(nums2[i]) + 1;
                map2.put(nums2[i],value);
            }
            else{
                map2.put(nums2[i], 1);
            }
        }
        if(map1.size() < map2.size())
        return set_intersect(map1, map2);
        else return set_intersect(map2, map1);

    }
    public int[] set_intersect(HashMap <Integer,Integer> map1,HashMap <Integer,Integer> map2) {
        int [] result =new int[1000];
        int i = 0;
        for(Integer n:map1.keySet()){
            if(map2.containsKey(n)){
                for(int j = 0;j < Math.min(map1.get(n),map2.get(n));j ++){
                    result[i ++] = n;
                }
            }
        }
        return Arrays.copyOf(result, i);
    }
}

