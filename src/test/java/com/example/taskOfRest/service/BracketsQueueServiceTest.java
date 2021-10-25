package com.example.taskOfRest.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BracketsQueueServiceTest {

    @Test
    public void test_BracketService() throws Exception {
        BracketsQueueService bracketsQueueService = new BracketsQueueService();

        int checkOpenClose1 = bracketsQueueService.openCloseBrackets("({[])}");
        assertTrue(checkOpenClose1 == 0);

        int checkOpenClose2 = bracketsQueueService.openCloseBrackets("{[()()]}");
        assertTrue(checkOpenClose2 == 1);

        int checkOpenClose3 = bracketsQueueService.openCloseBrackets("{{[]()}}}}");
        assertTrue(checkOpenClose3 == 0);

        int checkOpenClose4 = bracketsQueueService.openCloseBrackets("([{{[(())]}}])");
        assertTrue(checkOpenClose4 == 1);

        int checkOpenClose5 = bracketsQueueService.openCloseBrackets("({}(");
        assertTrue(checkOpenClose5 == 0);

        int checkOpenClose6 = bracketsQueueService.openCloseBrackets("[()]{}{[()()]()}");
        assertTrue(checkOpenClose6 == 1);

        int checkOpenClose7 = bracketsQueueService.openCloseBrackets("{[()]}");
        assertTrue(checkOpenClose7 == 1);

        int checkOpenClose8 = bracketsQueueService.openCloseBrackets(" ");
        assertTrue(checkOpenClose8 == 0);

    }
}

