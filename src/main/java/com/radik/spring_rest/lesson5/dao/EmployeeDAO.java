package com.radik.spring_rest.lesson5.dao;

import com.radik.spring_rest.lesson5.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee>getAllEmployees();

    Employee getEmployee(int id);

    void saveOrUpdateEmployee(Employee employee);

    void deleteEmployee(int id);
}
