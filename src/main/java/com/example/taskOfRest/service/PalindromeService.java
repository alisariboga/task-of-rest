package com.example.taskOfRest.service;

import org.springframework.stereotype.Service;

@Service
public class PalindromeService {

    public Boolean isPalindrome(String text) {
        ReverseWordService reverseWordService = new ReverseWordService();

        String newText = text.trim().replaceAll("\\s", "").toLowerCase();
        String palindrome = reverseWordService.reverseWord(newText);

        if (palindrome.equals(newText)) {
            return true;
        } else {
            return false;
        }

    }
}
