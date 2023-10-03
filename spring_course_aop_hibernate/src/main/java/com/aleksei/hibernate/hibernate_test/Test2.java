package com.aleksei.hibernate.hibernate_test;

import com.aleksei.hibernate.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();

            Employee addEmployee = new Employee("Oleg", "Sidorov",
                    "HR", 700);
            session.beginTransaction();
            session.save(addEmployee);
//            session.getTransaction().commit();

            int mysId = addEmployee.getId();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Employee getEmployee = session.get(Employee.class, mysId);
            session.getTransaction().commit();
            System.out.println(getEmployee);


            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
