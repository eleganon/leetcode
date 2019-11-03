/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
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
    public boolean isSymmetric(TreeNode root) {
        return ismirror(root,root);    
    }
    public boolean ismirror(TreeNode p1,TreeNode p2){
        if(p1 == null&&p2 == null){
            return true;
        }
        if(p1 == null||p2 == null){
            return false;
        }
        if(p1.val != p2.val){
            return false;
        }
        return ismirror(p1.left,p2.right)&&ismirror(p1.right,p2.left);
    }
}

