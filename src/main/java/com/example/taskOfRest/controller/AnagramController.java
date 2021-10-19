package com.example.taskOfRest.controller;

import com.example.taskOfRest.entity.CheckAnagram;
import com.example.taskOfRest.entity.ResultAnagram;
import com.example.taskOfRest.service.AnagramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnagramController {


    @Autowired
    private AnagramService anagramService;


    @Autowired
    public AnagramController(AnagramService anagramService) {
        this.anagramService = anagramService;
    }

//    @PostMapping(value = "/anagram-checker", produces = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseBody
//    public ResultAnagram createAnagram(@RequestBody AnagramRequestDto checkAnagram) {
//        ResultAnagram result = anagramService.checkAnagram(checkAnagram.getAttribute1(), checkAnagram.getAttribute2());
//        return new ResultAnagram(checkAnagram.getAttribute1(), checkAnagram.getAttribute2(), result);
//    }

    @PostMapping(value = "/anagram", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResultAnagram checkAnagram(@RequestBody CheckAnagram checkAnagram) {
        return anagramService.checkAnagram(checkAnagram.getAttribute1(), checkAnagram.getAttribute2());

    }
}
