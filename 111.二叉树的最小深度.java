/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null){
            return minDepth(root.right) + 1;
        }
        if(root.right == null){
            return minDepth(root.left)+ 1;
        }
        return Math.min(minDepth(root.right),minDepth(root.left)) + 1;
    }
}

