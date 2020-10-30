package com.study.jw.study.leetcode.牛客;

/**
 * Created by jww on 2020/10/28.
 * Describe
 */
public class _最大公约数与最小公倍数 {
    public static void main(String[] args) {
        System.out.println(getNums(7, 101));
        System.out.println(getNums1(7, 101));
    }

    public static int getNums(int m, int n) {

        //交换成永远m最大
        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }

        //先用大数对小数取余，再用小数对余数取余，直到余数为0
        while (n != 0) {

            int r = m % n;
            m = n;
            n = r;
        }
        return m;
    }

    public static int getNums1(int m, int n) {
        return m * n / getNums(m, n);

    }
}
