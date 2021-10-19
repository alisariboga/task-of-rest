package com.example.taskOfRest.controller;

import com.example.taskOfRest.service.PalindromeService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
public class PalindromeController {

    public PalindromeService isPalindromeService;

    public PalindromeController(PalindromeService isPalindromeService) {
        this.isPalindromeService = isPalindromeService;
    }

    @GetMapping("/palindrome/{text}")
    @ResponseBody
    public Map<String, String> isPalindrome(@PathVariable("text") String text) {
        Boolean palindrome = isPalindromeService.isPalindrome(text);

        HashMap<String, String> map = new HashMap<>();
        map.put("input:", text);
        map.put("isPalindrome:", String.valueOf(palindrome));

        return map;
    }
}
