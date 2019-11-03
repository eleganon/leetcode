/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m - 1;
        int q = n - 1;
        int p1 = m + n - 1;
        while((p >= 0)&&(q >= 0)){
            nums1[p1--] = (nums1[p] > nums2[q])?nums1[p--]:nums2[q--];
        }
        System.arraycopy(nums2, 0, nums1,0, q + 1);
    }
}

