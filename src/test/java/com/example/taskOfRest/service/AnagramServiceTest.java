package com.example.taskOfRest.service;

import com.example.taskOfRest.entity.ResultAnagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramServiceTest {

    @Test
    public void createAnagramTest() throws Exception {
        AnagramService anagramService = new AnagramService();

        ResultAnagram resultAnagram1 = new ResultAnagram("silent", "listen", "anagram");
        ResultAnagram resultAnagram2 = new ResultAnagram("adana", "ankara", "not-anagram");
        ResultAnagram resultAnagram3 = new ResultAnagram("s i l e n t", "l i s t e n", "anagram");
        ResultAnagram resultAnagram4 = new ResultAnagram("s i l _ e n t", "l i s t _ e n", "not-anagram");

        ResultAnagram createAnagramListenAndSilent = anagramService.checkAnagram("silent", "listen");
        assertTrue(new ResultAnagram(createAnagramListenAndSilent.getAttribute1(), createAnagramListenAndSilent.getAttribute2(), createAnagramListenAndSilent.getResult()).equals(resultAnagram1));

        ResultAnagram createAnagramAdanaAndAnkara = anagramService.checkAnagram("adana", "ankara");
        assertTrue(new ResultAnagram(createAnagramAdanaAndAnkara.getAttribute1(), createAnagramAdanaAndAnkara.getAttribute2(), createAnagramAdanaAndAnkara.getResult()).equals(resultAnagram2));

        ResultAnagram createAnagramSpaceListenAndSilent = anagramService.checkAnagram("s i l e n t", "l i s t e n");
        assertTrue(new ResultAnagram(createAnagramSpaceListenAndSilent.getAttribute1(), createAnagramSpaceListenAndSilent.getAttribute2(), createAnagramSpaceListenAndSilent.getResult()).equals(resultAnagram3));

        ResultAnagram createAnagramListenAndSilentBetweenUnderscore = anagramService.checkAnagram("s i l _ e n t", "l i s t _ e n");
        assertTrue(new ResultAnagram(createAnagramListenAndSilentBetweenUnderscore.getAttribute1(), createAnagramListenAndSilentBetweenUnderscore.getAttribute2(), createAnagramListenAndSilentBetweenUnderscore.getResult()).equals(resultAnagram4));
    }

}