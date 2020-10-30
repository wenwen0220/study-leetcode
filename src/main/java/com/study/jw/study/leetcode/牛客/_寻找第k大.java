package com.study.jw.study.leetcode.牛客;

/**
 * Created by jww on 2020/10/27.
 * Describe
 * [1,3,5,2,2],5,3
 */
public class _寻找第k大 {
    public int findKth(int[] a, int n, int K) {
        // write code here

        return sorts(a, 0, n - 1, K);

    }

    private static int sorts(int[] a, int start, int end, int k) {
        int mid = getMid(start, end, a);
        if (k - 1 < mid) {
            return sorts(a, start, mid - 1, k);
        } else if (k - 1 > mid) {
            return sorts(a, mid + 1, end, k);
        } else {
            return a[mid];
        }
    }

    private static int getMid(int start, int end, int[] a) {
        int flag = a[start];
        while (start < end) {
            while (start < end) {
                if (a[end] < flag) {
                    end--;
                } else {
                    a[start] = a[end];
                    start++;
                    break;
                }
            }
            while (start < end) {
                if (a[start] > flag) {
                    start++;
                } else {
                    a[end] = a[start];
                    end--;
                    break;
                }
            }
        }
        a[start] = flag;
        return start;
    }
}
