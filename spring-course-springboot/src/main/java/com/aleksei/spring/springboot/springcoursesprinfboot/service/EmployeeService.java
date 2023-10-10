package com.aleksei.spring.springboot.springcoursesprinfboot.service;


import com.aleksei.spring.springboot.springcoursesprinfboot.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployee(int id);
    void deleteEmployee(int id);
}
