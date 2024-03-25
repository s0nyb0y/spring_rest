package com.radik.spring_rest.lesson1.service;

import com.radik.spring_rest.lesson1.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee>getAllEmployees();
    void saveOrUpdateEmployee(Employee employee);
    Employee getEmployee(int id);
    void deleteEmployee(int id);
}
