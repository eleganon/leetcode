/*
 * @lc app=leetcode.cn id=389 lang=java
 *
 * [389] 找不同
 */
class Solution {
    public char findTheDifference(String s, String t) {
        int i = 0;
        for(char s1 : s.toCharArray()){
            i ^= s1;
        }
        for(char t1 : t.toCharArray()){
            i ^= t1;
        }
        return (char)i;
    }
}

