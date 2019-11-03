/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */
class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int i = len - 2;
        if(digits[len - 1] == 9){
            int count = 1;
            while(i>= 0&& digits[i] == 9){
                i--;
                count ++;
            }
            if(i >= 0){
                digits[len - count -1]++;
                int j = len - count;
                while(j < len){
                    digits[j] = 0;
                    j++;
                }
                return digits;
            }
            else{
                int [] digits1 = new int [count+1];
                digits1[0] = 1;
                while(count > 0){
                    digits1[count] = 0;
                    count--;
                }
                return digits1;
            }
            
        }
        else{
            digits[len - 1]++;
            return digits;
        }
        
    }
}

