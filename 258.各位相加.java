/*
 * @lc app=leetcode.cn id=258 lang=java
 *
 * [258] 各位相加
 */
class Solution {
    public int addDigits(int num) {
        int result = 0;
        while(num != 0){
            result += num % 10;
            num /= 10;
        }
        if(result >= 10){
            return addDigits(result);
        }
        return result;
    }
}

