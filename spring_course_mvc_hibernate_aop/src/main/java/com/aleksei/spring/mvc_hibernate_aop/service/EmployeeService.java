package com.aleksei.spring.mvc_hibernate_aop.service;

import com.aleksei.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployee(int id);
}
