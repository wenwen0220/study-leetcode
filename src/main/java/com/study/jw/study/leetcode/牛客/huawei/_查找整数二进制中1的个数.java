package com.study.jw.study.leetcode.牛客.huawei;

import java.util.Scanner;

/**
 * Created by jww on 2020/10/30.
 * Describe 如：输入5，二进制101
 * 返回2
 *
 */
public class _查找整数二进制中1的个数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            String s = Integer.toBinaryString(n);
            String[] splits = s.split("0");
            int r = 0;
            for (String s1 : splits) {
                r += s1.length();
            }
            System.out.println(r);
        }
    }
}
