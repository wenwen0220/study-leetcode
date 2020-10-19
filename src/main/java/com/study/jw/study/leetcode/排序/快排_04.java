package com.study.jw.study.leetcode.排序;

/**
 * Created by jww on 2020/09/03.
 * Describe
 */
public class 快排_04 {

    private static int[] nums4 = new int[]{20, 30, 23, 57, 18, 89, 65, 56, 24, 34, 52};


    public static void main(String[] args) {

        sort4(0, nums4.length - 1);
        for (int i : nums4) {
            System.out.println(i);
        }
    }

    private static void sort4(int start, int end) {
        //递归边界
        if (start >= end) return;

        int mid = getMid4(start, end);
        sort4(start, mid);
        sort4(mid + 1, end);
    }

    //获得Mid的方法
    private static int getMid4(int start, int end) {
        //一个基准点
        int flag = nums4[start];
        while (end > start) {
            while (end > start) {
                if (nums4[end] > flag) {
                    end--;
                } else {
                    nums4[start] = nums4[end];
                    start++;
                    break;
                }
            }

            while (end > start) {
                if (nums4[start] < flag) {
                    start++;
                } else {
                    nums4[end] = nums4[start];
                    end--;
                    break;
                }
            }

        }
        nums4[start]=flag;
        return start;
    }
}
