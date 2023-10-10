package com.aleksei.spring.springboot.springcoursesprinfboot.dao;


import com.aleksei.spring.springboot.springcoursesprinfboot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
