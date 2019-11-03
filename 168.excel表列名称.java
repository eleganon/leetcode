/*
 * @lc app=leetcode.cn id=168 lang=java
 *
 * [168] Excel表列名称
 */
class Solution {
    public String convertToTitle(int n) {
        String s = "";
        while(n != 0){
            if(n % 26 == 0){
                s = 'Z' + s;
            }
            else{
                s = (char)(n % 26 + 64) + s;
            }
            if(n % 26 == 0){
                n = (n - 1)  / 26;
            }
            else{
                n = n  / 26;
            }
        }
        return s;
    }
}

