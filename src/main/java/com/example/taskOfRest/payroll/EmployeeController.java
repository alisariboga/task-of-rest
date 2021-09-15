package com.example.taskOfRest.payroll;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.springframework.web.bind.annotation.*;

@RestController
class EmployeeController {

    ConcurrentMap<String, Employee> employees = new ConcurrentHashMap<>();


    @GetMapping("/")
    public List<Employee> getAllEmployee() {
        return new ArrayList<Employee>(employees.values());
    }


}
