package com.infogalaxy.springemployeepayrollapp.entity;

import lombok.*;

import javax.persistence.*;

//Employee Entity and Model class for Handling all employee data
@Getter
@Setter
@ToString
@Entity
@Table(name="Employee")
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {
    @Id
    //Setting up id as PRIMARY KEY AND AUTO INCREMENTED
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;
    String name;
    String profile;
    String gender;
    String dept;
    String salary;
    String day;
    String month;
    String year;
    String notes;

//    public EmployeeEntity(long id, String name, String profile, String gender, String dept, String salary, String day, String month, String year, String notes) {
//        this.id = id;
//        this.name = name;
//        this.profile = profile;
//        this.gender = gender;
//        this.dept = dept;
//        this.salary = salary;
//        this.day = day;
//        this.month = month;
//        this.year = year;
//        this.notes = notes;
//    }
//
//    public EmployeeEntity() {
//        this.id = 0;
//        this.name = "";
//        this.profile = "";
//        this.gender = "";
//        this.dept = "";
//        this.salary = "";
//        this.day = "";
//        this.month = "";
//        this.year = "";
//        this.notes = "";
//    }
//
//    @Override
//    public String toString() {
//        return "EmployeeEntity{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", profile='" + profile + '\'' +
//                ", gender='" + gender + '\'' +
//                ", dept='" + dept + '\'' +
//                ", salary='" + salary + '\'' +
//                ", day='" + day + '\'' +
//                ", month='" + month + '\'' +
//                ", year='" + year + '\'' +
//                ", notes='" + notes + '\'' +
//                '}';
//    }
}
