package com.example.taskOfRest.service;

import org.springframework.stereotype.Service;

@Service
public class ReverseWordService {

    public String reverseWord(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
