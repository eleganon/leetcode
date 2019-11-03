/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p= new ListNode(-1);
        ListNode q = p;
        while(l1!=null&&l2!=null){
            if(l1.val < l2.val){
                q.next = l1;
                l1 = l1.next;
            }
            else {
                q.next = l2;
                l2 = l2.next;
            }
            q = q.next;
        }
        if(l1==null){
            q.next = l2;
        }
        else{
            q.next =l1;
        }
        return p.next;
}
}


