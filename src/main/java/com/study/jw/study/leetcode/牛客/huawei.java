package com.study.jw.study.leetcode.牛客;

import java.util.*;

/**
 * Created by jww on .
 * Describe
 */
public class huawei {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            List<Character> l = new ArrayList<Character>();
            String s = scan.next();
            for (int i = 0; i < s.length(); i++) {
                Character c = s.charAt(i);
                if(l.contains(c)){
                    continue;
                }
                l.add(c);
            }
            for(char r:l){
                System.out.print(r);
            }
        }
    }
}