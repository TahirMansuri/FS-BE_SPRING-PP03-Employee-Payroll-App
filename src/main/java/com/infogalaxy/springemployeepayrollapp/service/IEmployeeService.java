package com.infogalaxy.springemployeepayrollapp.service;

import com.infogalaxy.springemployeepayrollapp.entity.EmployeeEntity;


//Employee Service interface declaring different functionalities
public interface IEmployeeService {
    EmployeeEntity addEmployee(EmployeeEntity employeeEntity);
}