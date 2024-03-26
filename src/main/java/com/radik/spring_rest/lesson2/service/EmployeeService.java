package com.radik.spring_rest.lesson2.service;

import com.radik.spring_rest.lesson2.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee>getAllEmployees();

    Employee getEmployee(int id);
}
