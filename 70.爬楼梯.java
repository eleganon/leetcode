/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */
class Solution {
    public int fribon(int n,int ret1,int ret2){
        if(n == 1){
            return ret1;
        }
        else{
            return fribon(n- 1,ret2,ret1 + ret2);
        }
    }
    public int climbStairs(int n) {
        return fribon(n, 1, 2);
    }
}

