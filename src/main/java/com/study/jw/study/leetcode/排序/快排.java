package com.study.jw.study.leetcode.排序;

/**
 * Created by jww on 20200808.
 * Describe
 */
public class 快排 {


    private static Integer[] nums = Integers.random(10, 0, 100);

    public static void main(String[] args) {

        Integers.println(nums);
        sort(0, nums.length - 1);
        Integers.println(nums);
    }

    //递归
    public static void sort(int begin, int end) {

        //第一次就要写递归的停止条件
        if (end - begin < 1) return;
        int mid = getMid(begin, end);
        sort(begin, mid);
        sort(mid + 1, end);
    }

    //获取轴点元素，每次把将begin、end与轴点元素比较。
    private static int getMid(int begin, int end) {
        int x = nums[begin];
        while (begin < end) {
            while (begin < end) {
                if (nums[end] > x) {
                    end--;
                } else {
                    nums[begin] = nums[end];
                    begin++;
                    break;
                }
            }
            while (begin < end) {
                if (nums[begin] < x) {
                    begin++;
                } else {
                    nums[end] = nums[begin];
                    end--;
                    break;
                }
            }
        }
        nums[begin] = x;
        return begin;
    }
}
