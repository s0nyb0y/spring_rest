package com.radik.spring_rest.lesson3.service;

import com.radik.spring_rest.lesson3.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee>getAllEmployees();

    Employee getEmployee(int id);
}
