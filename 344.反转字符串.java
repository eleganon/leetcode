/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 */
class Solution {
    public void reverseString(char[] s) {
        int j = s.length - 1;
        for(int i = 0;i < j;i ++,j --){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}

