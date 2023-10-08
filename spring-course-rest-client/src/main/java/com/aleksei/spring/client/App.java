package com.aleksei.spring.client;

import com.aleksei.spring.client.config.MyConfig;
import com.aleksei.spring.client.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication",
                Communication.class);
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println("*".repeat(35));
        System.out.println(allEmployees);

        System.out.println("*".repeat(35));

        Employee employeeById = communication.getEmployee(1);
        System.out.println(employeeById);
        System.out.println("*".repeat(35));

        Employee employeeForSave = new Employee();
        employeeForSave.setName("Alla");
        employeeForSave.setSurname("Briukhacheva");
        employeeForSave.setDepartment("HR");
        employeeForSave.setSalary(360);
//        communication.saveEmployee(employeeForSave);
        System.out.println("*".repeat(35));

        Employee employeeForUpdate = new Employee();
        employeeForUpdate.setId(12);
        employeeForUpdate.setName("Alla");
        employeeForUpdate.setSurname("Briukhacheva");
        employeeForUpdate.setDepartment("IT");
        employeeForUpdate.setSalary(780);
//        communication.saveEmployee(employeeForUpdate);
        System.out.println("*".repeat(35));

        communication.deleteEmployee(12);
        System.out.println("*".repeat(35));
        communication.deleteEmployee(13);
        System.out.println("*".repeat(35));

    }
}
