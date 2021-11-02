package com.example.taskOfRest.service;

import java.util.Stack;

public class BracketsStackService {
    public int isOpenCloseBrackets(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            String ch = s.substring(i, i + 1);
            if (ch.equals("(") || ch.equals("[") || ch.equals("{")) {
                stack.push(ch);
            } else {
                if (stack.isEmpty()){
                    return 0;
                }
                else if (ch.equals(")")) {
                    if (!stack.pop().equals ("(")) {
                        return 0;
                    }
                }
                else if (ch.equals("]")) {
                    if (!stack.pop().equals("[")) {
                        return 0;
                    }
                }
                else if (ch.equals("}")) {
                    if (!stack.pop().equals("{")) {
                        return 0;
                    }
                }
            }
        }
        if (!stack.isEmpty()){
            return 0;
        }
        return 1;
    }
}