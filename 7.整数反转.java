/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */
class Solution {
    public int reverse(int x) {
        long y = x;
        long i = 0;
        while(y != 0){
            y = y/10;
            i = i + 1;
        }
        long j = 0;
        long z = 0;
        while(i != 0){
            long x1 = x / (int)Math.pow(10,i-1);
            x = x % (int)Math.pow(10,i-1);
            z = z + x1*(int)Math.pow(10,j);
            j = j + 1;
            i = i - 1;
        }
        if(z >= Integer.MIN_VALUE && z <= Integer.MAX_VALUE){
            return (int)z;
        }else {
            return 0;
        }
    }
}

