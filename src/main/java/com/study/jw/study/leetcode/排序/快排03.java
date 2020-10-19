package com.study.jw.study.leetcode.排序;

/**
 * Created by jww on 20200814.
 * Describe 没有一次通过，要仔细思考
 */
public class 快排03 {
    static Integer[] ums=Integers.random(10,1,100);

    public static void main(String[] args) {
        sort03(0,ums.length);
        Integers.println(ums);
    }

    private static void sort03(int start, int end) {

        if(end-start<2) return;
        int mid = getMid03(start,end);
        sort03(0,mid);
        sort03(mid+1,end);
    }

    private static int getMid03(int start, int end) {
        end--;
        //每次随机打散一个坐标
        int index=start+(int)Math.random()*(end-start);
        int x=ums[index];
        while(end>start){
            while(end>start){
                if(ums[end]>x){
                    end--;
                }else {
                    ums[start]=ums[end];
                    start++;
                    break;
                }
            }

            while(end>start){
                if(ums[start]<x){
                    start++;
                }else {
                    ums[end]=ums[start];
                    end--;
                    break;
                }
            }
        }

        ums[start]=x;
        return start;
    }
}
