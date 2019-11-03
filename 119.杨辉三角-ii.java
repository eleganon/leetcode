import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 */
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prerow = new LinkedList<Integer>();
        prerow.add(1);
        if(rowIndex == 0){
            return prerow;
        }
        for(int i = 0;i < rowIndex;i ++){
            List<Integer> row = new LinkedList<Integer>();
            row.add(1);
            for(int j = 1;j <= i;j ++){
                row.add(prerow.get(j - 1) + prerow.get(j));
            }
            row.add(1);
            prerow = row;
            if(i == rowIndex - 1){
                return row;
            }
        }
        return null;
    }
}

