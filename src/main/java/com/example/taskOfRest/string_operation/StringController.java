package com.example.taskOfRest.string_operation;

import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@ComponentScan
public class StringController {


    public StringService stringService;

    public StringController(StringService stringService) {
        this.stringService = stringService;
    }


    @GetMapping("/reverse/{word}")
    public String reverseWord(@PathVariable("word") String word) {
        String reversing = stringService.reverseWord(word);
        return reversing;
    }

    @GetMapping("/palindrome/{text}")
    @ResponseBody
    public Map<String, String> isPalindrome(@PathVariable("text") String text) {
        Boolean palindrome = stringService.isPalindrome(text);

        HashMap<String, String> map = new HashMap<>();
        map.put("input:", text);
        map.put("isPalindrome:", String.valueOf(palindrome));

        return map;
    }

    @PostMapping(value = "/anagram", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResultAnagram createAnagram(@RequestBody CheckAnagram checkAnagram) {
        return stringService.createAnagram(checkAnagram.getAttribute1(), checkAnagram.getAttribute2());


    }
}