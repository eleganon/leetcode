/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */
class Solution {
    public int romanToInt(String s) {
        int i = 0;
        int result = 0;
        while (i < s.length()) {
            switch (s.charAt(i)) {
            case 'I':
                if(i+1 < s.length()){
                    if (s.charAt(i + 1) != 'V' && s.charAt(i + 1) != 'X') {
                        result = result + 1;
                        i = i + 1;
                    } else if (s.charAt(i + 1) == 'V') {
                        result = result + 4;
                        i = i + 2;
                    } else {
                        result = result + 9;
                        i = i + 2;
                    }
                    
                }
                else{
                    result = result + 1;
                    i = i + 1;
                }
                break;
            case 'V':
                result = result + 5;
                i = i + 1;
                break;
            case 'X':
                if(i + 1 < s.length()){
                    if (s.charAt(i + 1) != 'L' && s.charAt(i + 1) != 'C') {
                        result = result + 10;
                        i = i + 1;
                    } else if (s.charAt(i + 1) == 'L') {
                        result = result + 40;
                        i = i + 2;
                    } else {
                        result = result + 90;
                         i = i + 2;
                    }
                }
                else{
                    result = result + 10;
                    i = i + 1;
                }
                break;
            case 'L':
                result = result + 50;
                i = i + 1;
                break;
            case 'C':
                if(i + 1 < s.length()){
                    if (s.charAt(i + 1) != 'D' && s.charAt(i + 1) != 'M'){
                        result = result + 100;
                        i = i + 1;
                    }
                    else if (s.charAt(i + 1) == 'D') {
                        result = result + 400;
                        i = i + 2;}
                    else {
                        result = result + 900;
                        i = i + 2;
                    }

                }
                else{
                    result = result + 100;
                    i = i + 1;
                }
                break;
            case 'D':
                result = result + 500;
                i = i + 1;
                break;
            case 'M':
                result = result + 1000;
                i = i + 1;
                break;
            default:
                i = i + 1;
                break;
            }
            
        }
    return result;
    }
}
