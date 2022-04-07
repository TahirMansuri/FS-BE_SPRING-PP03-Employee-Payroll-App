package com.infogalaxy.springemployeepayrollapp.repository;

import com.infogalaxy.springemployeepayrollapp.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//Employee Repo extending the JpaRepository to perform CRUD Operations
public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Long> {

}
