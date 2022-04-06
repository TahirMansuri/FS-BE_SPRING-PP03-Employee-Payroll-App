package com.infogalaxy.springemployeepayrollapp.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@Entity
@Table(name="Employee")
public class EmployeeEntity {
    @Id
    int id;
    String name;
    String image;
    String gender;
    String dept;
    String salary;
    String date;
    String notes;

    public EmployeeEntity(String name, String image, String gender, String dept, String salary, String date, String notes) {
        this.name = name;
        this.image = image;
        this.gender = gender;
        this.dept = dept;
        this.salary = salary;
        this.date = date;
        this.notes = notes;
    }

    public EmployeeEntity() {
        this.name = "";
        this.image = "";
        this.gender = "";
        this.dept = "";
        this.salary = "";
        this.date = "";
        this.notes = "";
    }
}
