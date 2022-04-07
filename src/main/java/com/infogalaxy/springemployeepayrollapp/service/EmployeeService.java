package com.infogalaxy.springemployeepayrollapp.service;

import com.infogalaxy.springemployeepayrollapp.entity.EmployeeEntity;
import com.infogalaxy.springemployeepayrollapp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Employee Service class Implementig Employee Service Interface
@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public EmployeeEntity addEmployee(EmployeeEntity employeeEntity) {

        //Save data to DB usig Employee Repo Interface
        return employeeRepo.save(employeeEntity);
    }
}
