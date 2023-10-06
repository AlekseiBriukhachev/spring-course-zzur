package com.aleksei.spring.mvc_hibernate_aop.dao;

import com.aleksei.spring.mvc_hibernate_aop.entity.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Employee> getAllEmployees() {

        return sessionFactory.getCurrentSession()
                .createQuery("FROM Employee", Employee.class)
                .getResultList();
    }

    @Override
    public void saveEmployee(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
    }
}