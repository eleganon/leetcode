/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 报数
 */
class Solution {
    public String countAndSay(int n) {
        String [] str = new String [n + 2];
        int i = 1;
        str[1] = "1";
        if(n == 1){
            return str[1];
        }
        while(i < n){
            str[i + 1] = "";
            int j = 0;
            while(j < str[i].length()){
                int count = 1;
                while(j + 1 < str[i].length()&&str[i].charAt(j) == str[i].charAt(j + 1)){
                        count++;
                        j ++;
                    }
                str[i + 1] = str[i + 1]+String.valueOf(count) + String.valueOf(str[i].charAt(j));
                j ++;
            }
            i ++; 
        }
        return str[i];
    }
}

