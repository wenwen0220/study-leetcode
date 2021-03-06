package com.study.jw.study.leetcode.排序;

/**
 * Created by jww on 20200806.
 * Describe
 */
public class _快速排序 {
    private static Integer[] nums = Integers.random(100, 1, 100000);

    public static void main(String[] args) {

        //0 1 2 3 4 5 6 7
        //1,3,7,6,4,5,2,8

        sort(0, nums.length);
        Integers.println(nums);

    }

    public static void sort(int begin, int end) {
        if (end - begin < 2) return;

        //获得轴点元素的位置，交换完位置才有了轴点元素。
        int mid = getMid(begin, end);
        //递归2边
        sort(begin, mid);
        sort(mid+1, end);
    }

    private static int getMid(int begin, int end) {
        int x = nums[begin];
        end--;
        /*
         3个while循环
         每次都跟轴点元素比较
         */
        while (begin < end) {
            while (begin < end) {
                if (nums[end] - x > 0) {
                    end--;
                } else {
                    nums[begin] = nums[end];
                    begin++;
                    break;
                }
            }
            while (begin < end) {
                if (x - nums[begin] > 0) {
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
