package com.example.taskOfRest.service;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CircularArrayListServiceTest {
    @Test
    public void test_FindMinimumValueInArrayWithCircularArrayList() throws Exception {
        CircularArrayListService circularArrayListService = new CircularArrayListService();
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        List<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);


        Integer newArrayFindMinValue_1 = circularArrayListService.findMinimumValueInArrayWithCircularArrayList(list);
        assertTrue(newArrayFindMinValue_1 == 1);

        Integer newArrayFindMinValue2 = circularArrayListService.findMinimumValueInArrayWithCircularArrayList(list1);
        assertTrue(newArrayFindMinValue2 == 2);


    }

}
