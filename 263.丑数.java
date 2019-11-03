/*
 * @lc app=leetcode.cn id=263 lang=java
 *
 * [263] 丑数
 */
class Solution {
    public boolean isUgly(int num) {
        if(num == 1){
            return true;
        }
        if(num == 0){
            return false;
        }
        if(num % 2 == 0){
            return isUgly(num / 2);
        }
        if(num % 5 == 0){
            return isUgly(num / 5);
        }
        if(num % 3 == 0){
            return isUgly(num / 3);
        }
        return false;

    }
}

