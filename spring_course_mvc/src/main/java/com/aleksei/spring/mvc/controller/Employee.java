package com.aleksei.spring.mvc.controller;

import com.aleksei.spring.mvc.controller.validation.CheckEmail;
import lombok.Data;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

@Data
public class Employee {
    @Size(min = 2, message = "Name must be minimum 2 symbols")
    private String name;
//    @NotEmpty(message = "surname is required field")
    @NotBlank(message = "surname is required field")
    private String surname;
    @Min(message = "must be greater than 499", value = 500)
    @Max(message = "must be less than 1001", value = 1000)
    private int salary;
    private String department;
    private String carBrand;
    private Map<String, String> departments;
    private Map<String, String> carBrands;
    private Map<String, String> languageMap;
    private String[] languages;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please, use pattern XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail(value = "abc.com", message = "email must ends with abc.com")
    private String email;
    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology" );
        departments.put("HR", "Human Resources" );
        departments.put("Sales", "Sales" );

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Audi", "Audi");
        carBrands.put("Mercedes-Benz", "MB");

        languageMap = new HashMap<>();
        languageMap.put("English", "EN");
        languageMap.put("Deutsch", "DE");
        languageMap.put("French", "FE");

    }
}
