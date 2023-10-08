package com.aleksei.spring.rest.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeIncorrectData {
    private String info;

    public EmployeeIncorrectData() {
    }
}
