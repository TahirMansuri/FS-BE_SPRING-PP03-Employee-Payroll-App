package com.infogalaxy.springemployeepayrollapp.service;

import com.infogalaxy.springemployeepayrollapp.entity.EmployeeEntity;
import org.springframework.web.servlet.ModelAndView;


//Employee Service interface declaring different functionalities
public interface IEmployeeService {
    EmployeeEntity addEmployee(EmployeeEntity employeeEntity);
    ModelAndView getAllEmp();
    void addEmployee2(EmployeeEntity employeeEntity);

}