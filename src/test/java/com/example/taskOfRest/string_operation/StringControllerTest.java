package com.example.taskOfRest.string_operation;

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

@WebMvcTest(value = StringController.class)
@ExtendWith(SpringExtension.class)
public class StringControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void reverseWordTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                        .get("/reverse/alican")
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("nacila"));
    }

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

    @Test
    void isAnagramTestResultTrue() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                        .get("/anagram/listen/silent")
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json("{\"isAnagram:\":\"true\",\"input1:\":\"listen\",\"input2:\":\"silent\"}"));
    }


}

