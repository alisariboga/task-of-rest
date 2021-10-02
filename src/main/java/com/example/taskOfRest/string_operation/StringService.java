package com.example.taskOfRest.string_operation;

import java.util.Arrays;
import org.springframework.stereotype.Service;

@Service
public class StringService {


    public String reverseWord(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public Boolean isPalindrome(String text) {
        String newText = text.trim().replaceAll("\\s", "").toLowerCase();
        String palindrome = reverseWord(newText);
        if (palindrome.equals(newText)) {
            return true;
        } else {
            return false;
        }

    }

    public Boolean isAnagram(String firstWord, String secondWord) {
        firstWord.trim().replaceAll("\\s", "");
        secondWord.trim().replaceAll("\\s", "");


        char[] arrayFirstWord = firstWord.toLowerCase().toCharArray();
        char[] arraySecondWord = firstWord.toLowerCase().toCharArray();


        Arrays.sort(arrayFirstWord);
        Arrays.sort(arraySecondWord);

        if (arrayFirstWord.equals(arraySecondWord)) {
            return true;
        } else {
            return false;
        }


    }
}






