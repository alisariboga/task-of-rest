package com.example.taskOfRest.payroll;


import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class EmployeeController {


    @Autowired
    public EmployeeController() {
    }


    ConcurrentMap<String, Employee> employees = new ConcurrentHashMap<>();


    @GetMapping("/employees/{id}")
    public String getEmployee(@PathVariable String id) {
        return "result: " + id;
    }

    @GetMapping("/add/{a}/{b}")
    public String getEmployee(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        int total = a + b;
        return "result = " + total;
    }


}

//Farkli bir endpoint yazmaliyim, bu endpoint verdigim bir stringi ters cevirip geri donen bir endpoint.
//bu islemi bir service classi icinde yaziyorum
//3 tane event don.

