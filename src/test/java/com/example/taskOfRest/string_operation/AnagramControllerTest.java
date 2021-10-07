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

@WebMvcTest(value = AnagramController.class)
@ExtendWith(SpringExtension.class)
public class AnagramControllerTest {
    @Autowired
    private MockMvc mockMvc;
    //@Mock
    //private AnagramService anagramService;
    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void test_checkAnagram_whenTwoWordsAreAnagram_shouldReturnTrue() throws Exception {
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
//        when(anagramService.checkAnagram("silent","listen")).thenReturn("anagram");

        mockMvc.perform(MockMvcRequestBuilders
                        .post("/anagram-checker")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new AnagramRequestDto("silent", "listen")))
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content()
                        .json(objectMapper.writeValueAsString(new ResultAnagram("silent", "listen", "anagram"))));

//        verify(anagramService).checkAnagram("silent","listen");
    }


    @Test
    void test_checkAnagram_whenTwoWordsAreAnagram_shouldReturnFalse() throws Exception {
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

        mockMvc.perform(MockMvcRequestBuilders
                        .post("/anagram-checker")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new AnagramRequestDto("ankara", "adana")))
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content()
                        .string(objectMapper.writeValueAsString(new ResultAnagram("ankara", "adana", "not-anagram"))));
    }


}
