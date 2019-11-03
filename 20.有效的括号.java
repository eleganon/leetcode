import java.util.Stack;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int i= 0;
        while(i < s.length()){
            if((s.charAt(i)==')'||s.charAt(i)==']'||s.charAt(i)=='}')&&i==0){
                return false;
            }
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
                i = i + 1;
            }
            else {
                if(!stack.empty()){
                    char c = stack.pop();
                    if((c == '('&& s.charAt(i)==')')||(c == '{'&& s.charAt(i)=='}')||(c == '['&& s.charAt(i)==']')){
                        i = i + 1;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
               
            }
        }
        if(stack.empty()){
            return true;
        }
        else{
            return false;
        }
        
        
    }
}

