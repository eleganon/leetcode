/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 */
class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int j = s.length() - 1;
        for(int i = 0;i < j;){
            if(sb.charAt(i) == 'a' ||sb.charAt(i) == 'e'||sb.charAt(i) == 'i' ||sb.charAt(i) == 'o'||sb.charAt(i) == 'u'||sb.charAt(i) == 'A' ||sb.charAt(i) == 'E'||sb.charAt(i) == 'I' ||sb.charAt(i) == 'O'||sb.charAt(i) == 'U'){
                if(sb.charAt(j) == 'a' ||sb.charAt(j) == 'e'||sb.charAt(j) == 'i' ||sb.charAt(j) == 'o'||sb.charAt(j) == 'u'||sb.charAt(j) == 'A' ||sb.charAt(j) == 'E'||sb.charAt(j) == 'I' ||sb.charAt(j) == 'O'||sb.charAt(j) == 'U'){
                    char temp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j, temp);
                    i ++;
                }
                j --;
            }
            else if(sb.charAt(j) == 'a' ||sb.charAt(j) == 'e'||sb.charAt(j) == 'i' ||sb.charAt(j) == 'o'||sb.charAt(j) == 'u'||sb.charAt(j) == 'A' ||sb.charAt(j) == 'E'||sb.charAt(j) == 'I' ||sb.charAt(j) == 'O'||sb.charAt(j) == 'U'){
                if(sb.charAt(i) == 'a' ||sb.charAt(i) == 'e'||sb.charAt(i) == 'i' ||sb.charAt(i) == 'o'||sb.charAt(i) == 'u'||sb.charAt(i) == 'A' ||sb.charAt(i) == 'E'||sb.charAt(i) == 'I' ||sb.charAt(i) == 'O'||sb.charAt(i) == 'U'){
                    char temp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j, temp);
                    j --;
                }
                i ++;
            }
            else{
                i ++;
                j --;
            }
        }
        return sb.toString();
    }
}

