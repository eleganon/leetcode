/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int strs_length = strs.length;
        String prefix = "";
        if(strs_length!=0){
            prefix = strs[0];
        }
        int i = 0;
        while(i < strs_length){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);
            }
            i = i  + 1;
        }
        return prefix; 
}
}

