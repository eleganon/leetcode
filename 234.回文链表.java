import java.util.Stack;

/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack stack  = new Stack<Integer>();
        ListNode p = head;
        int count = 0;
        while(p != null){
            count ++;
            p = p.next;
        }
        p = head;
        for(int i = 0;i < count / 2;i ++){
            stack.push(p.val);
            System.out.println(stack.peek());
            p = p.next;
        }
        if(count % 2 != 0){
            p = p.next;
        }
        while(p != null){
            if((int)stack.pop() != p.val){
                return false;
            }
            p = p.next;
        }
        return true;
    }
}

