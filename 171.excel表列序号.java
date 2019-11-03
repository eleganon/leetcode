/*
 * @lc app=leetcode.cn id=171 lang=java
 *
 * [171] Excel表列序号
 */
class Solution {
    public int titleToNumber(String s) {
        int result = 0 ;
        for(int i = s.length()-1;i >=0;i --){
            int j = s.charAt(i) - 'A' + 1;
            j *= Math.pow(26, s.length()-1-i);

            result += j;
        }
        return result;
    }
}

