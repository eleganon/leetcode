import java.util.Arrays;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */
class Solution {
    public int[] set_intersection(HashSet <Integer> set1,HashSet <Integer> set2) {
        int i = 0;
        int [] result = new int[set1.size()];
        for(Integer m:set1){
            if(set2.contains(m)) result[i ++] = m;
        }
        return Arrays.copyOf(result, i);
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set1 = new HashSet<>();
        for(Integer n:nums1 ){
            set1.add(n);
        }
        HashSet <Integer> set2 = new HashSet<>();
        for(Integer n:nums2 ){
            set2.add(n);
        }
        if(set1.size() < set2.size()){
            return set_intersection(set1, set2);
        }
        else{
            return set_intersection(set2, set1);
        }
    }
}

