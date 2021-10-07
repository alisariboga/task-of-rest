package com.example.taskOfRest.string_operation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
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

    private ObjectMapper objectMapper = new ObjectMapper();


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
    void createAnagramTestResultTrue() throws Exception {
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mockMvc.perform(MockMvcRequestBuilders
                        .post("/anagram")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new CheckAnagram("silent", "listen")))
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(objectMapper.writeValueAsString(new ResultAnagram("silent", "listen", "anagram"))));
    }

    @Test
    void createAnagramTestResultTrue2() throws Exception {
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mockMvc.perform(MockMvcRequestBuilders
                        .post("/anagram")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new CheckAnagram("kres", "srek")))
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(objectMapper.writeValueAsString(new ResultAnagram("kres", "srek", "anagram"))));
    }

    @Test
    void createAnagramTestResultFalse() throws Exception {
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mockMvc.perform(MockMvcRequestBuilders
                        .post("/anagram")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new CheckAnagram("adana", "ankara")))
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(objectMapper.writeValueAsString(new ResultAnagram("adana", "ankara", "not-anagram"))));
    }

}

