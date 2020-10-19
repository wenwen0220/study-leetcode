package com.study.jw.study.leetcode;

/**
 * Created by jww on 2020-08-26.
 * Describe
 */
public class StringTest {
    public static void main(String[] args) {
        String s="[{}]";
        for (char c : s.toCharArray()) {
            if(c=='[') System.out.println(c);
//            System.out.println(c);
        }
    }
}
