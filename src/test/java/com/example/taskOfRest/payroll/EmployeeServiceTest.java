package com.example.taskOfRest.payroll;

import com.example.taskOfRest.string_operation.StringService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeServiceTest {


    @Test
    public void reverseWordTest() throws Exception {
        StringService stringService = new StringService();
        String reverseWord = stringService.reverseWord("adana");
        assertTrue(reverseWord.equals("anada"));
    }
}