package com.study.jw.study.leetcode.牛客.huawei;

/**
 * Created by jww on 2020/10/30.
 * 暴力穷举法
 * Describe 最长回文字串的长度
 * 输入：abaaab
 * 输出：4
 */
public class _最长回文子串 {

    public static void main(String[] args) {

        String s="abaaab";
        int n=s.length();

        String max="";
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                String s1=s.substring(i,j);
                String s2=new StringBuffer(s1).reverse().toString();
                if(s1.equals(s2)){
                    if(max.length()<s2.length()){
                        max=s2;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
