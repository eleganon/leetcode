import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=112 lang=java
 *
 * [112] 路径总和
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
    public boolean hasPathSum(TreeNode root, int sum) {
        return PathSum(root, 0, sum);
        
    }
    public boolean PathSum(TreeNode root,int cur,int sum){
        if(root == null){
            return false;
        }
        cur = cur + root.val;
        if(root.left == null&&root.right == null){
            return cur == sum;
        }
        else{
            return PathSum(root.left, cur, sum)||PathSum(root.right, cur, sum);
        }
    }
}

