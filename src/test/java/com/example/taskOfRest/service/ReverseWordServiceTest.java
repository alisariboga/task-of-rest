package com.example.taskOfRest.service;

import com.example.taskOfRest.service.ReverseWordService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ReverseWordServiceTest {

    @Test
    public void reverseWordTest() throws Exception {
        ReverseWordService reverseWordService = new ReverseWordService();

        String reverseWordAdana = reverseWordService.reverseWord("adana");
        assertTrue(reverseWordAdana.equals("anada"));

        String reverseWordLondon = reverseWordService.reverseWord("Lon don");
        assertFalse(reverseWordLondon.equals("nodnoL"));

        String reverseWordScreenCapital = reverseWordService.reverseWord("SECREN");
        assertTrue(reverseWordScreenCapital.equals("NERCES"));

        String reverseWordScreenCapitalCase = reverseWordService.reverseWord("SECREN");
        assertTrue(reverseWordScreenCapitalCase.equals("NERCES"));

        String reverseWordScreenLowerCase = reverseWordService.reverseWord("head");
        assertTrue(reverseWordScreenLowerCase.equals("daeh"));

        String reverseWordSpace = reverseWordService.reverseWord("A L I C A N");
        assertTrue(reverseWordSpace.equals("N A C I L A"));

        String reverseWordBeginSpace = reverseWordService.reverseWord(" ALICAN");
        assertTrue(reverseWordBeginSpace.equals("NACILA "));

        String reverseWordMiddleSpace = reverseWordService.reverseWord("ALI CAN");
        assertTrue(reverseWordMiddleSpace.equals("NAC ILA"));

        String reverseWordEndSpace = reverseWordService.reverseWord("ALICAN ");
        assertTrue(reverseWordEndSpace.equals(" NACILA"));

    }
}