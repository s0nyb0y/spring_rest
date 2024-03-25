package com.radik.spring_rest.lesson1.dao;

import com.radik.spring_rest.lesson1.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee>getAllEmployees();
    void saveOrUpdateEmployee(Employee employee);
    Employee getEmployee(int id);
    void deleteEmployee(int id);
}
