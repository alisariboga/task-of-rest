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

    public ResultAnagram createAnagram(String firstWord, String secondWord) {

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

    public Integer sortedArrayAndFindMinValue(int[] numbers) {
        int minValue = numbers[0];

        Arrays.sort(numbers);
        for (int i = 1; i < numbers.length - 1; i++)
            if (minValue < numbers[i]) {
                minValue = numbers[0];
            }


        return minValue;

    }

    public Integer binarySearch(int numbers[], int )
}






