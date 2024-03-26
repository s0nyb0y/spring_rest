package com.radik.spring_rest.lesson2.dao;

import com.radik.spring_rest.lesson2.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee>getAllEmployees();

    Employee getEmployee(int id);
}
