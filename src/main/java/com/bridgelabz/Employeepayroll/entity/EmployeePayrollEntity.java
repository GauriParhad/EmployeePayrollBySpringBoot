package com.bridgelabz.Employeepayroll.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class EmployeePayrollEntity {

    @Id
    private int Id;
    private String name;
    private int salary;
}
