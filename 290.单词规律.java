import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=290 lang=java
 *
 * [290] 单词规律
 */
class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap <Character,String> map = new HashMap<>();
        String [] s = str.split(" ");
        if(pattern.length() != s.length){
            return false;
        }
        for(int i = 0;i < pattern.length();i ++){
            char key = pattern.charAt(i);
            if(map.containsKey(key)){
                if(! s[i].equals(map.get(key))){
                    return false;
                }
            }
            else{
                if(map.containsValue(s[i])){
                    return false;
                }
                map.put(key,s[i]);
            }
        }
        return true;
    }
}

