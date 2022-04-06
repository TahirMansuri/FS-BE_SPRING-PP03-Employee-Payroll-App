package com.infogalaxy.springemployeepayrollapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/emphome")
    public String openHome1() {
        return "index";
    }

    @GetMapping("/emppayroll")
    public String openHome2() {
        return "emppayroll";
    }

}
