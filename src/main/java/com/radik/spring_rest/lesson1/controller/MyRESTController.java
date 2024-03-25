package com.radik.spring_rest.lesson1.controller;

import com.radik.spring_rest.lesson1.entity.Employee;
import com.radik.spring_rest.lesson1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {
    private final EmployeeService employeeService;

    @Autowired
    public MyRESTController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
}
