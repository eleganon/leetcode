import java.util.Stack;

/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */
class MinStack {
    Stack <Integer> stack;
    Stack <Integer> min_stack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack <> ();
        min_stack = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
        if(min_stack.empty() || x <= min_stack.peek()){
            min_stack.push(x);
        }
    }
    
    public void pop() {
        int e = stack.pop();
        if(e == min_stack.peek()){
            min_stack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min_stack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

