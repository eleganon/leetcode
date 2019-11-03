import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
/*
 * @lc app=leetcode.cn id=107 lang=java
 *
 * [107] 二叉树的层次遍历 II
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
        LinkedList<Integer> temp = new LinkedList<Integer>();
        Queue <TreeNode> que = new LinkedList<TreeNode>();
        if(root == null){
            return result;
        }
        int cur = 1;
        int next = 0;
        que.offer(root);
        while(!que.isEmpty()){
            {
                TreeNode node = que.poll();
                temp.add(node.val);
                if(node.left != null ){
                    que.offer(node.left);
                    next ++;
                }
                if(node.right != null){
                    que.offer(node.right);
                    next ++;
                }
                if(-- cur == 0){
                    List<Integer> t = new LinkedList<Integer>(temp);
                    result.add(t);
                    temp.clear();
                    cur = next;
                    next = 0;
                }
            }
        }
        Collections.reverse(result);
        return result;
    }
}


