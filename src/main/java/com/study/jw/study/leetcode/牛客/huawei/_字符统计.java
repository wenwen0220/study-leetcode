package com.study.jw.study.leetcode.牛客.huawei;

import java.util.*;

/**
 * Created by jww on 2020/10/29.
 * Describe
 * 如果统计的个数相同，则按照ASCII码由小到大排序输出 。如果有其他字符，则对这些字符不用进行统计。
 * <p>
 * 实现以下接口：
 * 输入一个字符串，对字符中的各个英文字符，数字，空格进行统计（可反复调用）
 * 按照统计个数由多到少输出统计结果，如果统计的个数相同，则按照ASCII码由小到大排序输出
 * 清空目前的统计结果，重新统计
 * 调用者会保证：
 * 输入的字符串以‘\0’结尾。
 * <p>
 * aadddccddc
 * <p>
 * dca
 */
public class _字符统计 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            String s=scan.next();
            char[] chars1 = s.toCharArray();
            TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
            for (int i = 0; i < chars1.length; i++) {
                char c = chars1[i];
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            int max = 0;
            Set<Map.Entry<Character, Integer>> entries = map.entrySet();
            for (Map.Entry<Character, Integer> entry : entries) {
                max = Math.max(entry.getValue(), max);
            }

            StringBuffer sb = new StringBuffer();
            while (max != 0) {
                for (Map.Entry<Character, Integer> entry : entries) {
                    if (entry.getValue() == max) {
                        sb.append(entry.getKey());
                    }
                }
                max--;
            }
            System.out.println(sb.toString());

        }
    }
}
