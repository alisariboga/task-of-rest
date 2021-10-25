package com.example.taskOfRest.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BracketsStackServiceTest {

    @Test
    public void test_BracketService() throws Exception {
        BracketsStackService bracketsStackService = new BracketsStackService();

        int checkOpenClose1 = bracketsStackService.isOpenCloseBrackets("({[])}");
        assertTrue(checkOpenClose1 == 0);

        int checkOpenClose2 = bracketsStackService.isOpenCloseBrackets("{[()()]}");
        assertTrue(checkOpenClose2 == 1);

        int checkOpenClose3 = bracketsStackService.isOpenCloseBrackets("{{[]()}}}}");
        assertTrue(checkOpenClose3 == 0);

        int checkOpenClose4 = bracketsStackService.isOpenCloseBrackets("([{{[(())]}}])");
        assertTrue(checkOpenClose4 == 1);

        int checkOpenClose5 = bracketsStackService.isOpenCloseBrackets("({}(");
        assertTrue(checkOpenClose5 == 0);

        int checkOpenClose6 = bracketsStackService.isOpenCloseBrackets("[()]{}{[()()]()}");
        assertTrue(checkOpenClose6 == 1);

        int checkOpenClose7 = bracketsStackService.isOpenCloseBrackets("{[()]}");
        assertTrue(checkOpenClose7 == 1);

        int checkOpenClose8 = bracketsStackService.isOpenCloseBrackets(" ");
        assertTrue(checkOpenClose8 == 0);


    }
}

