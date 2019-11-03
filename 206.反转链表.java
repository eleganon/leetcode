import javax.management.ListenerNotFoundException;

/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
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
    public ListNode reverseList(ListNode head) {
        ListNode p = new ListNode (-1);
        p = head;
        while(p != null && p.next != null){
            p = p.next;
            System.out.println(p.val);
        }
        while(head != p ){
            ListNode node = new ListNode(-1);
            node.val = head.val;
            System.out.println(p.val);
            node.next = p.next;
            p.next = node;
            head = head.next;
        }
    return p;
}
}

