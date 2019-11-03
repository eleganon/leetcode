

/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现strStr()
 */
class Solution {
    public int strStr(String haystack, String needle) {
        // int n_length = needle.length();
        // int h_length = haystack.length();
        // if(needle ==""){
        //     return 0;
        // }
        // else if(h_length < n_length){
        //     return -1;
        // }
        // else if(h_length == n_length){
        //     return haystack.equals(needle)?0:-1;
        // }
        // else{
        //     int start = 0;
        //     int end = h_length - n_length;
        //     while(start <= end){
        //         if(haystack.substring(start, start + n_length).equals(needle)){
        //             return start;
        //         }
        //         start ++;
        //     }
        // }
        // return -1;
            if(needle == ""){
                return 0;
            }
            int index = haystack.indexOf(needle);
            return index;
    }
}

