package com.infogalaxy.springemployeepayrollapp.service;

import com.infogalaxy.springemployeepayrollapp.entity.EmployeeEntity;
import com.infogalaxy.springemployeepayrollapp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

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

    @Override
    public void addEmployee2(EmployeeEntity employeeEntity) {

        //Save data to DB usig Employee Repo Interface
        employeeRepo.save(employeeEntity);
    }

    @Override
    public ModelAndView getAllEmp() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("employees",employeeRepo.findAll());
        return modelAndView;
    }
}
