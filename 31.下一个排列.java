import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=31 lang=java
 *
 * [31] 下一个排列
 *
 * https://leetcode-cn.com/problems/next-permutation/description/
 *
 * algorithms
 * Medium (32.15%)
 * Likes:    307
 * Dislikes: 0
 * Total Accepted:    29.2K
 * Total Submissions: 90.9K
 * Testcase Example:  '[1,2,3]'
 *
 * 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 * 
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 * 
 * 必须原地修改，只允许使用额外常数空间。
 * 
 * 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 * 
 */

// @lc code=start
class Solution {
    public void quick_sort(int s[], int l, int r) {
        if (l < r) {
            // Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = l, j = r, x = s[l];
            while (i < j) {
                while (i < j && s[j] >= x) // 从右向左找第一个小于x的数
                    j--;
                if (i < j)
                    s[i++] = s[j];

                while (i < j && s[i] < x) // 从左向右找第一个大于等于x的数
                    i++;
                if (i < j)
                    s[j--] = s[i];
            }
            s[i] = x;
            quick_sort(s, l, i - 1); // 递归调用
            quick_sort(s, i + 1, r);
        }
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int l = n - 2;
        int r = n - 1;
        int flag = 0;
        while (l >= 0) {
            if (nums[r] > nums[l]) {
                flag = 1;
                break;
            }
            l--;
            r--;
        }
        if (flag == 1) {
            for (int i = n - 1; i >= 0; i--) {
                if (nums[i] > nums[l]) {
                    int temp = nums[i];
                    nums[i] = nums[l];
                    nums[l] = temp;
                    break;
                }
            }
            quick_sort(nums, l + 1, n - 1);
        } else {
            Arrays.sort(nums);
        }

    }
}
// @lc code=end
