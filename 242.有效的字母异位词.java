import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;



/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character,Integer> set2= new HashMap<>();        
        HashMap <Character,Integer> set= new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0;i <s.length();i ++){
            if(set.keySet().contains(s.charAt(i))){
                int value = set.get(s.charAt(i));
                set.put(s.charAt(i),++value);
            }
            else{
                set.put(s.charAt(i), 1);
            }
        }
        for(int i = 0;i < t.length();i ++){
            if(set2.keySet().contains(t.charAt(i))){
                int value = set2.get(t.charAt(i));
                set2.put(t.charAt(i),++value);
            }
            else{
                set2.put(t.charAt(i), 1);
            }
        }
        Iterator <Character> iter = set.keySet().iterator();
        while(iter.hasNext()){
                char key=iter.next();
                int value = set.get(key);
                System.out.println(key+" "+value);
        }
        Iterator <Character> iter1 = set2.keySet().iterator();
        while(iter1.hasNext()){
                char key=iter1.next();
                int value = set2.get(key);
                System.out.println(key+" "+value);
        }
        if(set.equals(set2)){
            return true;
        }
        // for(int i = 0;i < s.length();i ++){
        //     if(set2.keySet() != set.keySet()){
        //         return false;
        //     }
        //     if(set2.get(s.charAt(i)) != set.get(s.charAt(i)))
        //    {System.out.println(set2.get(s.charAt(i)+" "+set.get(s.charAt(i))));
        //     return false;
        //    }
        // }
        return false;
    }
}

