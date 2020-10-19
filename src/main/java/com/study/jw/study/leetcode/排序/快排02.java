package com.study.jw.study.leetcode.排序;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by jww on 20200811.
 * Describe
 */
public class 快排02 {


//    static Integer[] s = Integers.random(10, 1, 100);

    public static void main(String[] args) {
//        Integer[] s = Integers.random(3, 1, 100);
//        Integers.println(s);
//        sort2(0, s.length - 1,s);
//        Integers.println(s);
        int[] n={1,75,3,87,23,98};
        List<int[]> ints = Arrays.asList(n);

    }

    private static void sort2(int begin, int end, Integer[] s) {

        //递归范式
        if (end - begin < 1) return;
        int mid = getMid2(begin, end,s);
        sort2(begin, mid, s);
        sort2(mid + 1, end, s);
    }

    private static int getMid2(int begin, int end, Integer[] s) {


        //  随便选择一个作为对比
        int x = s[begin];
        while (end > begin) {
            while (end > begin) {
                if (s[end] > x) {
                    end--;
                } else {
                    s[begin] = s[end];
                    begin++;
                    break;
                }
            }

            while (end > begin) {
                if (s[begin] < x) {
                    begin++;
                } else {
                    s[end] = s[begin];
                    end--;
                    break;
                }
            }
        }


        s[begin] = x;

        return begin;
    }

}
