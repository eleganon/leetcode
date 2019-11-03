/*
 * @lc app=leetcode.cn id=108 lang=java
 *
 * [108] 将有序数组转换为二叉搜索树
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        return mySortedArrayToBST(nums,0,nums.length);
    }
    public TreeNode mySortedArrayToBST(int [] nums,int left,int right){
        if(left < right){
            int mid = (left + right) / 2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = mySortedArrayToBST(nums,left,mid);
            node.right = mySortedArrayToBST(nums,mid + 1,right);
            return node;
        }
        else{
            return null;
        }
    }
}

