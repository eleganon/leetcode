/*
 * @lc app=leetcode.cn id=204 lang=java
 *
 * [204] 计数质数
 */
class Solution {
    public int countPrimes(int n) {
        // if(n <= 2){
        //     return 0;
        // }
        // int count = 0;
        // for(int m = 3 ;m < n;m ++){
        //     int i = m - 1;
        //     while(i >= 2){
        //         if(m % i == 0)
        //             break;
        //         i --;
        //     }
        //     if(i == 1){
        //         count ++;
        //     }
        // }
        // return ++count;
        int count = 0;
        boolean [] prime = new boolean [n/2 + 1];
        for(int i = 1;i < n/2;i ++){
            prime[i - 1] = true;
        }
        for(int i = 0;i <= Math.sqrt(n);i ++){
            int m = i;
            for(int j = i*(2*i+6)+3;j < n/2;j += 2 * (i + 1) + 1){
                prime[j] = false;
            }
            
        }
        for(int i = 0;i < n/2;i ++){
            if(prime[i] == true){
                count ++;
            }
        }
        if(n <= 2){
            return 0;
        }
        return ++count;
    }
}

