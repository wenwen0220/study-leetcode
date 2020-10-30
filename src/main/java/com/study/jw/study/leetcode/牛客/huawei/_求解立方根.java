package com.study.jw.study.leetcode.牛客.huawei;

/**
 * Created by jww on 2020/10/29.
 * Describe
 */
public class _求解立方根 {
    public static void main(String[] args) {

        System.out.println(getCubeRoot(216.0));
    }
    public static double getCubeRoot(double input){
        if(input==1) return 1;

        double mid=input/2;
        while(mid>0.1){

            if(mid*mid*mid>input){
                mid=mid/2;
            }else {
                mid=mid+(input-mid)/2;
            }
        }

        return mid;
    }
}
