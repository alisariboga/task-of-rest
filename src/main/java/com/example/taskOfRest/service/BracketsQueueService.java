package com.example.taskOfRest.service;

import java.util.ArrayDeque;
import java.util.Deque;

public class BracketsQueueService {
    public int openCloseBrackets(String s) {
        Deque<Character> queue = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (c) {
                case ')':
                    if (queue.isEmpty() || queue.pop() != '(')
                        return 0;
                    break;
                case ']':
                    if (queue.isEmpty() || queue.pop() != '[')
                        return 0;
                    break;
                case '}':
                    if (queue.isEmpty() || queue.pop() != '{')
                        return 0;
                    break;
                default:
                    queue.push(c);
                    break;
            }
        }

        return queue.isEmpty() ? 1 : 0;
    }
}
