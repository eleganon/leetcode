/*
 * @lc app=leetcode.cn id=172 lang=java
 *
 * [172] 阶乘后的零
 */
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        int i = 0;
        while(625 * Math.pow(5,i) <= n){
            i ++;
        }
        System.out.println(i);
        count = n / 5 + n / 25 + n / 125;
        int j = 0;
        while(j < i){
            count  += n /(int)(625 * Math.pow(5,j));
            j ++;
        }
        return count;
    }
}

