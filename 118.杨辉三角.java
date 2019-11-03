import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> nums = new LinkedList<List<Integer>>();
        List<Integer> num1 = new LinkedList<Integer>();
        if(numRows == 0){
            return nums;
        }
        int i = 1;
        nums.add(num1);
        nums.get(0).add(1);
        while(i < numRows){
            List<Integer> num = new LinkedList<Integer>();
            List<Integer> pre = nums.get(i - 1);
            num.add(1);
            for(int j = 1;j < i;j ++){
                num.add(pre.get(j - 1) + pre.get(j));
            }
            num.add(1);
            nums.add(num);
            i ++;
        }
        return nums;
    }
}

