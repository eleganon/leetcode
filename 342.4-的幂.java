/*
 * @lc app=leetcode.cn id=342 lang=java
 *
 * [342] 4的幂
 */
class Solution {
    public boolean isPowerOfFour(int num) {
        return (Math.log(num) / Math.log(4) % 1 == 0);
    }
}

