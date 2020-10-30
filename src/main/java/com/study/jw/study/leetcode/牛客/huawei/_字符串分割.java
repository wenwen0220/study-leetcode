package com.study.jw.study.leetcode.牛客.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jww on 2020/10/30.
 * Describe
 * 2
 * abc
 * 123456789
 */
public class _字符串分割 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){

            int n=scan.nextInt();
            List<String> list=new ArrayList<>();
            for (int i = 0; i <n ; i++) {
                String s=scan.next();

                int length=s.length();

                if(length<=8){
                    StringBuffer s1=new StringBuffer(s);
                    for (int l = 0; l <8-length ; l++) {
                        s1.append("0");
                    }
                    list.add(s1.toString());
                }else {
                    int index=0;
                    for (int j = 0; j <length/8 ; j++) {
                        index=8 * (j + 1);
                        String s1 = s.substring(8 * j, index);
                        list.add(s1);
                    }
                    String s2=s.substring(index, length);
                    StringBuffer last=new StringBuffer(s2);
//                    System.out.println(last.length());

                    for (int k = 0; k <8-s2.length() ; k++) {
                        last.append("0");
                    }
                    list.add(last.toString());
                }
            }

            list.forEach(System.out::println);

        }
        scan.close();

    }
}
