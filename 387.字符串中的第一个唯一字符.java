import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=387 lang=java
 *
 * [387] 字符串中的第一个唯一字符
 */
class Solution {
    public int firstUniqChar(String s) {
        // HashMap<Character, Integer> map = new HashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        //     if (map.containsKey(s.charAt(i))) {
        //         int value = map.get(s.charAt(i)) + 1;
        //         map.put(s.charAt(i), value);
        //     } else {
        //         map.put(s.charAt(i), 1);
        //     }
        // }
        // int min = -1;
        // for (char n : map.keySet()) {
        //     if (map.get(n) == 1) {
        //         min = min == -1 ? s.indexOf(n) : min;
        //         if (s.indexOf(n) < min) {
        //             min = s.indexOf(n);
        //         }
        //     }
        // }
        // if (map.containsValue(1)) {
        //     return min;
        // }
        // else{
        //     return -1;
        // }
        for(int i = 0;i < s.length();i ++){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}
