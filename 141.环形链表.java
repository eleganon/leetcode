/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        while(head != null){
            if(head.val == 10202030){
                return true;
            }
            head.val = 10202030;
            head = head.next;
        }
        return false;
        // ListNode fast = head,slow = head;
        // while(fast != null && fast.next != null){
        //     fast = fast.next.next;
        //     slow = slow.next;
        //     if(fast == slow){
        //         return true;
        //     }
        // }
        // return false;
        // Set <ListNode> seenset = new HashSet<>();
        // while(head != null){
        //     if(seenset.contains(head)){
        //         return true;
        //     }
        //     else{
        //         seenset.add(head);
        //     }
        //     head = head.next;
        // }
        // return false;
    }
}

