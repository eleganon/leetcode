/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */
class Solution {
    public String addBinary(String a, String b) {
        int a_len = a.length();
        int b_len = b.length();
        int [] temp = new int [1000];
        int min_len = Math.min(a_len, b_len);
        int max_len = Math.max(a_len, b_len);
        String s = "";
        StringBuilder sum = new StringBuilder("");
        while(a_len < b_len){
            a = '0' + a;
            a_len++;
        }
        while(b_len < a_len){
            b = '0' + b;
            b_len++;
        }
        int c = 0;
        for(int i = a_len - 1; i >= 0;i --){
            temp[i + 1] = (int)(a.charAt(i))^(int)(b.charAt(i))^c;
            if(a.charAt(i) == '1'&&b.charAt(i) == '1'&&c == 1||a.charAt(i) == '1'&&b.charAt(i) == '1'||b.charAt(i) == '1'&&c == 1||a.charAt(i) == '1'&&c == 1){
                c = 1;
            }
            else{
                c = 0;
            } 
        }
        if(c == 1){
            temp[0] = 1;
            int i = 0;
            while(i <= a_len){
                sum.append(String.valueOf(temp[i])) ;
                i++;
            }
            s = sum.toString();
        }
        else{
            int i = 1;
            while(i <=a_len){
                sum.append(String.valueOf(temp[i])) ;
                i++;
            }
            s = sum.toString();
        }
        System.out.println(sum);
        System.out.println(s);
        return s;
        }
}

