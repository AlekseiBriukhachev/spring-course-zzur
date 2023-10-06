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

        sessionFactory.getCurrentSession()
                .saveOrUpdate(employee);
    }

    @Override
    public Employee getEmployee(int id) {

        return sessionFactory.getCurrentSession()
                .get(Employee.class, id);
    }

    @Override
    public void deleteEmployee(int id) {
        sessionFactory.getCurrentSession()
                .createQuery("DELETE FROM Employee WHERE id=:emloyeeId")
                .setParameter("emloyeeId", id)
                .executeUpdate();
    }
}
