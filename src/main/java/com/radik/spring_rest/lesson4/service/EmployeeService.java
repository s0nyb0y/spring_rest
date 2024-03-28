package com.radik.spring_rest.lesson4.service;

import com.radik.spring_rest.lesson4.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee>getAllEmployees();

    Employee getEmployee(int id);

    Employee saveOrUpdateEmployee(Employee employee);
}
