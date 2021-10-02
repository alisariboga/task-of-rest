package com.example.taskOfRest.string_operation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringServiceTest {
    @Test
    public void reverseWordTest() throws Exception {
        StringService stringService = new StringService();

        String reverseWordAdana = stringService.reverseWord("adana");
        assertTrue(reverseWordAdana.equals("anada"));

        String reverseWordLondon = stringService.reverseWord("Lon don");
        assertFalse(reverseWordLondon.equals("nodnoL"));

        String reverseWordScreenCapital = stringService.reverseWord("SECREN");
        assertTrue(reverseWordScreenCapital.equals("NERCES"));

        String reverseWordScreenCapitalCase = stringService.reverseWord("SECREN");
        assertTrue(reverseWordScreenCapitalCase.equals("NERCES"));

        String reverseWordScreenLowerCase = stringService.reverseWord("head");
        assertTrue(reverseWordScreenLowerCase.equals("daeh"));

        String reverseWordSpace = stringService.reverseWord("A L I C A N");
        assertTrue(reverseWordSpace.equals("N A C I L A"));

        String reverseWordBeginSpace = stringService.reverseWord(" ALICAN");
        assertTrue(reverseWordBeginSpace.equals("NACILA "));

        String reverseWordMiddleSpace = stringService.reverseWord("ALI CAN");
        assertTrue(reverseWordMiddleSpace.equals("NAC ILA"));

        String reverseWordEndSpace = stringService.reverseWord("ALICAN ");
        assertTrue(reverseWordEndSpace.equals(" NACILA"));

    }

    @Test
    public void isPalindromeTest() throws Exception {
        StringService stringService = new StringService();

        Boolean isPalindromeAda = stringService.isPalindrome("ada");
        assertTrue(isPalindromeAda);

        Boolean isPalindromeBibSpace = stringService.isPalindrome("b i b");
        assertTrue(isPalindromeBibSpace);

        Boolean isPalindromeAdaAdaMiddleSpace = stringService.isPalindrome("ada ada");
        assertTrue(isPalindromeAdaAdaMiddleSpace);

        Boolean isPalindromeAdaAdaBegin_And_MiddleSpace = stringService.isPalindrome(" ada ada");
        assertTrue(isPalindromeAdaAdaBegin_And_MiddleSpace);

        Boolean isPalindromeAdaAdaMiddle_And_EndSpace = stringService.isPalindrome("ada ada ");
        assertTrue(isPalindromeAdaAdaMiddle_And_EndSpace);

        Boolean isPalindromeAdaAdaAfterEachLetterSpace = stringService.isPalindrome("a d a a d a");
        assertTrue(isPalindromeAdaAdaAfterEachLetterSpace);

        Boolean isPalindromeAdaMiddle_And_EndSpace = stringService.isPalindrome("Ada ada ");
        assertTrue(isPalindromeAdaMiddle_And_EndSpace);
    }

    @Test
    public void isAnagramTest() throws Exception {
        StringService stringService = new StringService();

        Boolean isAnagramListenAndSilent = stringService.isAnagram("silent", "listen" );
        assertTrue(isAnagramListenAndSilent);

        Boolean isAnagramAdanaAndAnkara= stringService.isAnagram("adana", "ankara" );
        assertFalse(isAnagramAdanaAndAnkara);

    }


}
