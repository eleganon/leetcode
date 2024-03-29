/*
 * @lc app=leetcode.cn id=191 lang=java
 *
 * [191] 位1的个数
 */
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int mask = 1;
        int count = 0;
        for(int i = 0;i < 32;i ++){
            if((n & mask) != 0){
                count ++;
            }
            n >>= 1;
        }
        return count;
    }
}

