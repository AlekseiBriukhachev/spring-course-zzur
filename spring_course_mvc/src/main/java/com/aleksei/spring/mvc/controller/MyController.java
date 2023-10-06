package com.aleksei.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showFirstView() {
        return "firstView";
    }
    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
//        Employee employee = new Employee();
//        employee.setName("Aleks");
//        employee.setSurname("Br");
//        employee.setSalary(900);
        model.addAttribute("employee", new Employee());

        return "askEmployeeDetails";
    }
    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee employee,
                                      BindingResult bindingResult) {

        System.out.println("surname length = " + employee.getSurname().length());
        System.out.println("phoneNumber = " + employee.getPhoneNumber());

        if (bindingResult.hasErrors()) {
            return "askEmployeeDetails";
        }
        return "showEmployeeDetails";
    }
}
