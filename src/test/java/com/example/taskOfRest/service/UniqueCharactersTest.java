package com.example.taskOfRest.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UniqueCharactersTest {

    @Test
    public void test_UniqueCharacters() throws Exception {
        UniqueCharactersService uniqueCharactersService = new UniqueCharactersService();

        Boolean checkUniqueCharacters1 = uniqueCharactersService.checkUniqueCharacters("abcd10jk");
        assertTrue(checkUniqueCharacters1 == true);

        Boolean checkUniqueCharacters2 = uniqueCharactersService.checkUniqueCharacters("g9mnd!nk9");
        assertTrue(checkUniqueCharacters2 == false);


    }
}
