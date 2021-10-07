package com.example.taskOfRest.string_operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan
public class AnagramController {

    @Autowired
    private AnagramService anagramService;

    @PostMapping(value = "/anagram-checker", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResultAnagram createAnagram(@RequestBody AnagramRequestDto checkAnagram) {
        String result = anagramService.checkAnagram(checkAnagram.getAttribute1(), checkAnagram.getAttribute2());
        return new ResultAnagram(checkAnagram.getAttribute1(), checkAnagram.getAttribute2(), result);
    }
}
