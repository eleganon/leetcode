/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */
class Solution {
    public int mySqrt(int x) {
        // long low = 0;
        // long high = x/2 + 1;
        // while(low < high){
        //     long mid = low + (high - low + 1) / 2;
        //     if(mid * mid <= x){
        //         low = mid;
        //     }
        //     else{
        //         high = mid - 1;
        //     }
        // }
        // return (int)low;
        long x1 = x;
        while(x1*x1 > x){
            x1 = (x1 + x / x1)/2;
        }
        return (int)x1;
    }
}

