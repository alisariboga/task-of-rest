package com.example.taskOfRest.service;

import com.example.taskOfRest.entity.ResultAnagram;
import java.util.Arrays;
import org.springframework.stereotype.Service;

@Service
public class AnagramService {
    public ResultAnagram checkAnagram(String firstWord, String secondWord) {

        char[] arrayFirstWord = firstWord.trim().replace("_", "").replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arraySecondWord = secondWord.trim().replaceAll("\\s", "").toLowerCase().toCharArray();

        Arrays.sort(arrayFirstWord);
        Arrays.sort(arraySecondWord);

        if (Arrays.equals(arrayFirstWord, arraySecondWord)) {
            return new ResultAnagram(firstWord, secondWord, "anagram");
        } else {
            return new ResultAnagram(firstWord, secondWord, "not-anagram");
        }
    }
}
