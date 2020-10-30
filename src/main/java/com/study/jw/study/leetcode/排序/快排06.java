package com.study.jw.study.leetcode.排序;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jww on .
 * Describe
 */
public class 快排06 {
    static int[] nums06={1,3,4,6,32,7,8,45,31,43};

    public static void main(String[] args) {

        sort06(0,nums06.length-1);
        for (int i = 0; i < nums06.length; i++) {
            System.out.println(nums06[i]);
        }

    }

    private static void sort06(int start, int end) {
        if(end-start<2) return;
        int mid =getMid(start,end);
        sort06(start,mid);
        sort06(mid+1,end);
    }

    private static int getMid(int start, int end) {
        int flag=nums06[start];
        while(end>start){
            while(end>start){
                if(nums06[end]>flag){
                    end--;
                }else {
                    nums06[start]=nums06[end];
                    start++;
                    break;
                }
            }
            while(end>start){
                if(nums06[start]<flag){
                    start++;
                }else {
                    nums06[end]=nums06[start];
                    end--;
                    break;
                }
            }

        }
        nums06[start]=flag;
        return start;
    }
}
