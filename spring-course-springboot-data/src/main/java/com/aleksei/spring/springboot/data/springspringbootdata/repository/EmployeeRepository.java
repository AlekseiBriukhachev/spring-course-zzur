package com.aleksei.spring.springboot.data.springspringbootdata.repository;


import com.aleksei.spring.springboot.data.springspringbootdata.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findAllByName(String name);
}
