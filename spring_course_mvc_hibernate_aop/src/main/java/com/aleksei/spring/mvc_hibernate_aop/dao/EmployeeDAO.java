package com.aleksei.spring.mvc_hibernate_aop.dao;

import com.aleksei.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();
}
