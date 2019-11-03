/*
 * @lc app=leetcode.cn id=190 lang=java
 *
 * [190] 颠倒二进制位
 */
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        for(int count = 32;count > 0;count --){
            res <<= 1;
            res += n & 1;
            n >>= 1;

        }
        return res;
    }
}

