import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */
class Solution {
    public boolean isHappy(int n) {
    //     HashSet<Integer> hashSet = new HashSet<Integer>();
    //     while(n != 1&&!hashSet.contains(n)){
    //         hashSet.add(n);
    //         double temp = 0;
    //         while(n != 0){
    //             temp +=  Math.pow(n%10, 2);
    //             n /= 10;
    //     }
    //     n = (int)temp;
    // }
    // return n == 1;
    do{
        int temp = 0;
        while(n != 0){
            temp +=  Math.pow(n%10, 2);
            n /= 10;
            }
            if(temp == 1){
                return true;
            }
        n = temp;
    }while(n != 4);//不是快乐数的数称为不快乐数(unhappy number)，所有不快乐数的数位平方和计算，最后都会进入 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4 的循环中
    return false;
    }
}


