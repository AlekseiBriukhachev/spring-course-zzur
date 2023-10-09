package com.aleksei.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String getInfoForAllEmployees() {
        return "viewForAllEmployees";
    }
    @GetMapping("/hr_info")
    public String getInfoOnlyForHR() {
        return "viewForHr";
    }
    @GetMapping("/manager_info")
    public String getInfoOnlyForManagers() {
        return "viewForManagers";
    }
}
