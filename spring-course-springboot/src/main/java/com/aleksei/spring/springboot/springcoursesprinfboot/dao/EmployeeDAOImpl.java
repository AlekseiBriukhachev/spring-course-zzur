package com.aleksei.spring.springboot.springcoursesprinfboot.dao;

import com.aleksei.spring.springboot.springcoursesprinfboot.entity.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {

//        return entityManager.unwrap(Session.class)
//                .createQuery("FROM Employee", Employee.class)
//                .getResultList();
        return entityManager.createQuery("FROM Employee", Employee.class)
                .getResultList();
    }

    @Override
    public void saveEmployee(Employee employee) {

//        entityManager.unwrap(Session.class)
//                .saveOrUpdate(employee);
        Employee newEmployee = entityManager.merge(employee);
        employee.setId(newEmployee.getId());
    }

    @Override
    public Employee getEmployee(int id) {

//        return entityManager.unwrap(Session.class)
//                .get(Employee.class, id);
        return entityManager.find(Employee.class, id);
    }

    @Override
    public void deleteEmployee(int id) {
//        entityManager.unwrap(Session.class)
        entityManager.createQuery("DELETE FROM Employee WHERE id=:emloyeeId")
                .setParameter("emloyeeId", id)
                .executeUpdate();
    }
}
