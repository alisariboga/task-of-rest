package com.example.taskOfRest.payroll;

import com.example.taskOfRest.service.ReverseWordService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeServiceTest {


    @Test
    public void reverseWordTest() throws Exception {
        ReverseWordService reverseWordService = new ReverseWordService();
        String reverseWord = reverseWordService.reverseWord("adana");
        assertTrue(reverseWord.equals("anada"));
    }
}