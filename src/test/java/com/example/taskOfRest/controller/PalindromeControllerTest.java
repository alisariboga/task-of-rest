package com.example.taskOfRest.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(value = PalindromeController.class)
@ExtendWith(SpringExtension.class)
public class PalindromeControllerTest {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private MockMvc mockMvc;

    @Test
    void isPalindromeTestResultTrue() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                        .get("/palindrome/ada")
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json("{\"isPalindrome:\":\"true\",\"input:\":\"ada\"}"));
    }

    @Test
    void isPalindromeTestResultFalse() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                        .get("/palindrome/adana")
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json("{\"isPalindrome:\":\"false\",\"input:\":\"adana\"}"));
    }
}
