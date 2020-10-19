package com.study.jw.study.leetcode.排序;

/**
 * Created by jww on 20200810.
 * Describe 还是不能一次通过
 */
public class 快排01 {
    private static Integer[] s = Integers.random(10, 1, 1000);

    public static void main(String[] args) {

        Integers.println(s);
        sortS(0, s.length-1);
        Integers.println(s);
    }

    private static void sortS(int start, int end) {

        //递归的停止条件
        if (end - start < 2) return;
        int mid = getMid(start, end);
        sortS(start, mid);
        sortS(mid + 1, end);
    }

    private static int getMid(int start, int end) {

        int x = s[start];
        while (end > start) {
            while (end > start) {
                if (s[end] > x) {
                    end--;
                } else {
                    s[start] = s[end];
                    start++;
                    break;
                }
            }

            while (end > start) {
                if (s[start] < x) {
                    start++;
                } else {
                    s[end] = s[start];
                    end--;
                    break;
                }
            }
        }
        s[start]=x;
        return start;
    }
}
