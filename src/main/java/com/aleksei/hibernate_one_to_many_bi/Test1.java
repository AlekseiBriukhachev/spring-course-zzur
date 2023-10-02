package com.aleksei.hibernate_one_to_many_bi;

import com.aleksei.hibernate_one_to_many_bi.entity.Department;
import com.aleksei.hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
//            Department department = new Department("IT", 300, 1200);
//            Employee emp1 = new Employee("Aleks", "Bru", 800);
//            Employee emp2 = new Employee("Anton", "Buben", 1500);
//            Employee emp3 = new Employee("Ivan", "Kukis", 1200);
//
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//            department.addEmployeeToDepartment(emp3);
//
//            session.beginTransaction();
//            session.save(department);
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");
//*****************************************************************
//
            session.beginTransaction();

            System.out.println("Get department");
            Department department = session.get(Department.class, 4);
            System.out.println("Show department");
            System.out.println(department);
            System.out.println("Show employees");
            System.out.println(department.getEmployees());
            session.getTransaction().commit();

            System.out.println("Done!");
//*****************************************************************
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//            session.getTransaction().commit();
//
//            System.out.println("Done!");
//*****************************************************************
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 4);
//
//            session.delete(employee);
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
