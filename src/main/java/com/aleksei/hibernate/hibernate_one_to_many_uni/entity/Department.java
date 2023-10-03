package com.aleksei.hibernate.hibernate_one_to_many_uni.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "department")
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String departmentName;
    @Column(name = "max_salary")
    private int maxSalary;
    @Column(name = "min_salary")
    private int minSalary;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    @ToString.Exclude
    private List<Employee> employees;


    public Department(String departmentName, int maxSalary, int minSalary) {
        this.departmentName = departmentName;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }
    public void addEmployeeToDepartment(Employee employee) {
        if (employees == null) {
            employees = new ArrayList<>();
        }
        employees.add(employee);
    }
}
