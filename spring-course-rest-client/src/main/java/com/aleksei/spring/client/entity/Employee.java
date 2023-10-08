package com.aleksei.spring.client.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Getter
@Setter
public class Employee {
    private int id;
    private String name;
    private String surname;
    private String department;
    private int salary;
}
