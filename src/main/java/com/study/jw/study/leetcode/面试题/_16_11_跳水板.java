package com.study.jw.study.leetcode.面试题;

/**
 * Created by jww on 2020.7.8.
 * Describe
 */
public class _16_11_跳水板 {
    public static int[] divingBoard(int shorter, int longer, int k) {

        if (k == 0) {
            return new int[0];
        }
        if (shorter == longer) {
            return new int[]{shorter * k};
        }

        /*
        k块板子一共k+1种结果
        用数学归纳法：
        短板=0的时候，长板=k
        短板=1的时候，长板=k-1
        短板=2的时候，长板=k-2
        .....
        短板=k-1的时候，长板=1
        短板=k的时候，长板=0
         */
        int[] result = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            result[i] = shorter * i + longer * (k - i);
        }
        return result;
    }

    public static void main(String[] args) {

        int[] x = divingBoard(1, 2, 3);
        for (int i : x) {
            System.out.println(i);
        }
    }
}
