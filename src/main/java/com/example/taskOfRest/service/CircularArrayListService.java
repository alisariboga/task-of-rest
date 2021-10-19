package com.example.taskOfRest.service;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CircularArrayListService {
    public Integer findMinimumValueInArrayWithCircularArrayList(List<Integer> list) {
        Integer minValue = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(0) > list.get(list.size() - 1)) {
                minValue = list.get(0);
                list.add(minValue);
                list.remove(0);
                minValue = list.get(0);
            }
            if (list.get(0) < list.get(list.size() - 1)) {

                break;
            }
        }
        return minValue;
    }
}
