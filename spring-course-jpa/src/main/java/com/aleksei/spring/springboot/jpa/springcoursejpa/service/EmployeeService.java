package com.aleksei.spring.springboot.jpa.springcoursejpa.service;


import com.aleksei.spring.springboot.jpa.springcoursejpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployee(int id);
    void deleteEmployee(int id);
    List<Employee> findAllByName(String name);
}
