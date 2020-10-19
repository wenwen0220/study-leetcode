package com.study.jw.study.leetcode.排序;

/**
 * Created by jww on 2020/09/22.
 * Describe
 */
public class 快排05 {
    static final int[] nums5 = new int[]{5, 2, 30, 21, 45, 32, 65, 37, 38};

    public static void main(String[] args) {
        sort5(0, nums5.length - 1);
        for (int i : nums5) {
            System.out.println(i);
        }
    }

    private static void sort5(int begin, int end) {
        if (begin >= end) return;
        int mid = getMid5(begin, end);
        sort5(begin, mid);
        sort5(mid + 1, end);
    }

    private static int getMid5(int begin, int end) {
        int flag = nums5[begin];
        while (end > begin) {
            while (end > begin) {
                if (nums5[end] > flag) {
                    end--;
                } else {
                    nums5[begin] = nums5[end];
                    begin++;
                    break;
                }
            }
            while (end > begin) {
                if (nums5[begin] < flag) {
                    begin++;
                } else {
                    nums5[end] = nums5[begin];
                    end--;
                    break;
                }
            }
        }
        nums5[begin] = flag;
        return begin;
    }
}
