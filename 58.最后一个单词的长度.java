/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */
class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        int count = 0;
        if(len == 0){
            return  0;
        }
        for(int i = len - 1;i >= 0;i--){
            if(s.charAt(i) != ' '){
                count ++;
                if((i-1 >= 0&&s.charAt(i - 1) == ' ')||i - 1 < 0){
                    break;
                }
            }
            
        }
        return count;
    }
}

