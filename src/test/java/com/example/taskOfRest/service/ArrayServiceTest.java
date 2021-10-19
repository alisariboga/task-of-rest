package com.example.taskOfRest.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayServiceTest {

    @Test
    public void test_FindMinValueInArray() throws Exception {
        ArrayService arrayService = new ArrayService();

        int newArrayFindMinValue_3 = arrayService.findMinValueInArray(new int[]{4, 5, 3, 6, -9, 45, 43, 15});
        assertTrue(newArrayFindMinValue_3 == -9);

        int newArrayFindMinValue_Mines12 = arrayService.findMinValueInArray(new int[]{-12, 7, 3, 6, -9, 45, 189, 15});
        assertTrue(newArrayFindMinValue_Mines12 == -12);

        int newArrayFindMinValue_Mines100 = arrayService.findMinValueInArray(new int[]{10, -198, 3, 76, -9, 45, 43, 15});
        assertTrue(newArrayFindMinValue_Mines100 == -198);

        int newArrayFindMinValue_Mines198 = arrayService.findMinValueInArray(new int[]{89, 5, 56, 6, -100, 21, 43, 15, 46, 54, 98, -1000});
        assertTrue(newArrayFindMinValue_Mines198 == -1000);


    }

}
