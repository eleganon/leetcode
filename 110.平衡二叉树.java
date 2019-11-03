/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        if(Math.abs(getdepth(root.left) - getdepth(root.right)) <= 1){
            return isBalanced(root.left)&&isBalanced(root.right);
        }
        else{
            return false;
        }
    }
    public int getdepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftdepth = getdepth(root.left);
        int rightdepth = getdepth(root.right);
        return leftdepth > rightdepth ? leftdepth + 1:rightdepth + 1;
    }
}

