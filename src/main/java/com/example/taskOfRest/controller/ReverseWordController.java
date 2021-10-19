package com.example.taskOfRest.controller;

import com.example.taskOfRest.service.ReverseWordService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan
public class ReverseWordController {

    public ReverseWordService reverseWordService;

    public ReverseWordController(ReverseWordService reverseWordService) {
        this.reverseWordService = reverseWordService;
    }



    @GetMapping("/reverse/{word}")
    public String reverseWord(@PathVariable("word") String word) {
        String reversing = reverseWordService.reverseWord(word);
        return reversing;
    }
}
