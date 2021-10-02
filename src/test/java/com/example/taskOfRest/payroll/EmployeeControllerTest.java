package com.example.taskOfRest.payroll;

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

@WebMvcTest(value = EmployeeController.class)
@ExtendWith(SpringExtension.class)
class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getEmployee() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                        .get("/employees/1")
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("result: " + 1));
    }

    @Test
    void getTotalEndPoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                        .get("/add/1/2")
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("result = " + 3));
    }

}