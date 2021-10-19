package com.example.taskOfRest.service;

import org.springframework.stereotype.Service;

@Service
public class ArrayService {
    public int findMinValueInArray(int[] newArray) {
        //sortArrayMethod(newArray);

        int minValue = newArray[0];

        for (int i = 1; i < newArray.length; i++) {
            if (newArray[i] < minValue) {
                minValue = newArray[i];
            }
        }
        return minValue;
    }
}
