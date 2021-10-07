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
        int number[] = {3, 4, 5, 6, 7, 1, 2,};

        int minValue = number[0];

        sortArrayMethod(number);

        for (int i = 1; i < number.length - 1; i++)
            if (minValue < number[i]) {
                minValue = number[0];
            }
        return minValue;

    }

    private void sortArrayMethod(int[] number) {
        int counter;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    counter = number[i];
                    number[i] = number[j];
                    number[j] = counter;
                }
            }
        }
    }

    public int my_BinarySearch(int newArray[], int number) {
        int left = 0;
        int right = newArray.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (number < newArray[middle]) {
                right = middle - 1;
            } else if (number > newArray[middle]) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }


}