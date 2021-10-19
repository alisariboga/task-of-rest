package com.example.taskOfRest.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CircularArrayToArrayListService {
    public int findMinimumValueInArrayWithCircularArrayToArrayList(Integer[] numberArray) {
        List<Integer> listArray = new ArrayList<>();
        Collections.addAll(listArray, numberArray);
        Integer minValue = null;
        for (int i = 0; i < listArray.size(); i++) {
            if (listArray.get(0) > listArray.get(listArray.size() - 1)) {
                minValue = listArray.get(0);
                listArray.add(minValue);
                listArray.remove(0);
                minValue = listArray.get(0);
            } else if (listArray.get(0) == listArray.get(listArray.size() - 1)) {
                minValue = listArray.get(0);
                listArray.add(minValue);
                listArray.remove(0);
                minValue = listArray.get(0);
            } else {
                break;
            }
        }
        return minValue;
    }

}
