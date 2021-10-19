package com.example.taskOfRest.service;

import org.springframework.stereotype.Service;

@Service
public class SortingArrayMethodService {
    private void sortArrayMethod(int[] newArray) {
        int counter;
        for (int i = 0; i < newArray.length; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i] > newArray[j]) {
                    counter = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = counter;
                }
            }
        }
    }

}
