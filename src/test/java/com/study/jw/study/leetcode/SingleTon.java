package com.study.jw.study.leetcode;

/**
 * Created by jww on .
 * Describe
 */
public class SingleTon {
    private static SingleTon ourInstance ;

    public static SingleTon getInstance() {
        if(ourInstance==null){
            synchronized (SingleTon.class){
                if(ourInstance==null){
                    ourInstance=new SingleTon();
                }
            }
        }
        return ourInstance;
    }

}
