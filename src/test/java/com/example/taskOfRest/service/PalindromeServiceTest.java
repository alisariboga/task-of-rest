package com.example.taskOfRest.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeServiceTest {

    @Test
    public void isPalindromeTest() throws Exception {
        PalindromeService palindromeService = new PalindromeService();

        Boolean isPalindromeAda = palindromeService.isPalindrome("ada");
        assertTrue(isPalindromeAda);

        Boolean isPalindromeBibSpace = palindromeService.isPalindrome("b i b");
        assertTrue(isPalindromeBibSpace);

        Boolean isPalindromeAdaAdaMiddleSpace = palindromeService.isPalindrome("ada ada");
        assertTrue(isPalindromeAdaAdaMiddleSpace);

        Boolean isPalindromeAdaAdaBegin_And_MiddleSpace = palindromeService.isPalindrome(" ada ada");
        assertTrue(isPalindromeAdaAdaBegin_And_MiddleSpace);

        Boolean isPalindromeAdaAdaMiddle_And_EndSpace = palindromeService.isPalindrome("ada ada ");
        assertTrue(isPalindromeAdaAdaMiddle_And_EndSpace);

        Boolean isPalindromeAdaAdaAfterEachLetterSpace = palindromeService.isPalindrome("a d a a d a");
        assertTrue(isPalindromeAdaAdaAfterEachLetterSpace);

        Boolean isPalindromeAdaMiddle_And_EndSpace = palindromeService.isPalindrome("Ada ada ");
        assertTrue(isPalindromeAdaMiddle_And_EndSpace);
    }
}
