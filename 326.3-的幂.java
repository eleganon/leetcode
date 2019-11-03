/*
 * @lc app=leetcode.cn id=326 lang=java
 *
 * [326] 3的幂
 */
class Solution {
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1.162261467E9 % n == 0;
    }
}

