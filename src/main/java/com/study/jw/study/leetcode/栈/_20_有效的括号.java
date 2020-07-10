package com.study.jw.study.leetcode.栈;

import java.util.Stack;

/**
 * Created by jww on 20200709.
 * Describe
 */
public class _20_有效的括号 {
    public boolean isValid(String s) {

        if (s == null) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                if (c == ')' && stack.pop() != '(') return false;
                if (c == ']' && stack.pop() != '[') return false;
                if (c == '}' && stack.pop() != '{') return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new _20_有效的括号().isValid("())"));
    }
}
