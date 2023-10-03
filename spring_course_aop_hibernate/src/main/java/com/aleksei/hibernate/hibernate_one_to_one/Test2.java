package com.aleksei.hibernate.hibernate_one_to_one;

import com.aleksei.hibernate.hibernate_one_to_one.entity.Details;
import com.aleksei.hibernate.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();

//            Employee employee = new Employee("Kolya", "Ivanov",
//                    "HR", 1000);
//            Details details = new Details("Tokio", "09739268736",
//                    "kolya@qwert.com");
//
//            employee.setEmployeeDetails(details);
//            details.setEmployee(employee);
//            session.beginTransaction();
//            session.save(details);
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");

            session.beginTransaction();
            Details details = session.get(Details.class, 1);
            System.out.println(details.getEmployee());
            Employee employee = session.get(Employee.class, 11);
            System.out.println(employee.getEmployeeDetails());

            session.getTransaction().commit();

            System.out.println("Done!");

//            session.beginTransaction();
//            Details details = session.get(Details.class, 1);
//            session.delete(details.getEmployee());
//            session.getTransaction().commit();

//            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
