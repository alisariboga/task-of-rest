package com.example.taskOfRest.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CircularArrayToArrayListServiceTest {
    @Test
    public void test_FindMinimumValueInArrayWithCircularArrayToArrayList() throws Exception {
        CircularArrayToArrayListService circularArrayToArrayListService = new CircularArrayToArrayListService();

        Integer newArrayFindMinValue_1 = circularArrayToArrayListService.findMinimumValueInArrayWithCircularArrayToArrayList(new Integer[]{7, 8, 9, 10, 1, 2, 3, 4, 5, 6});
        assertTrue(newArrayFindMinValue_1 == 1);

        Integer newArrayFindMinValue2 = circularArrayToArrayListService.findMinimumValueInArrayWithCircularArrayToArrayList(new Integer[]{11, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        assertTrue(newArrayFindMinValue2 == 2);

        Integer newArrayFindMinValue3 = circularArrayToArrayListService.findMinimumValueInArrayWithCircularArrayToArrayList(new Integer[]{7, 8, 9, 10, 11, 12, 12, 13, 3, 4, 5, 6});
        assertTrue(newArrayFindMinValue3 == 3);


    }

}
