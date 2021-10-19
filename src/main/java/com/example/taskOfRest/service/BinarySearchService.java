package com.example.taskOfRest.service;

import org.springframework.stereotype.Service;

@Service
public class BinarySearchService {

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
