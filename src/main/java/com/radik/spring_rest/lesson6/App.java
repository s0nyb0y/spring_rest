package com.radik.spring_rest.lesson6;

import com.radik.spring_rest.lesson6.configuration.MyConfig;
import com.radik.spring_rest.lesson6.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication",Communication.class);
        List<Employee>allEmployees = communication.getAllEmployees();
        for (Employee allEmployee : allEmployees) {
            System.out.println(allEmployee);
        }
        Employee empByID = communication.getEmployee(18);
        System.out.println();
        System.out.println(empByID);

        Employee employee = new Employee("Sveta","Sokolova","IT",1200);
        employee.setId(19);
        communication.saveOrUpdateEmployee(employee);

        communication.deleteEmployee(19);
    }
}
