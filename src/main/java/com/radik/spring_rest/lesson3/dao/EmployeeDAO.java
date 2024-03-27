package com.radik.spring_rest.lesson3.dao;

import com.radik.spring_rest.lesson3.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee>getAllEmployees();

    Employee getEmployee(int id);
}
