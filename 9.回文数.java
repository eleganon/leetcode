/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */
class Solution {
    public boolean isPalindrome(int x) {
        // String str = String.valueOf(x);
        // boolean flag = true;
        // int j = str.length();
        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i) != str.charAt(j - 1)) {
        //         flag = false;
        //         break;
        //     } else {
        //         j = j - 1;
        //     }
        // }
        // return flag;
        return new StringBuilder(String.valueOf(x)).reverse().toString().equals(String.valueOf(x));
    }
}
