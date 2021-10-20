package com.bridgelabz.Employeepayroll.model;


import com.bridgelabz.Employeepayroll.dto.EmpPayrollDto;
import lombok.Data;


/**
 * Create and maintains employee payroll data in object.
 *
 * @author Gauri Parhad
 */

@Data
public class EmpPayrollData {
    private int empId;
    private String name;
    private int salary;

    public EmpPayrollData(int empId, EmpPayrollDto empPayrollDTO) {
        this.empId = empId;
        this.name = empPayrollDTO.getName();
        this.salary = empPayrollDTO.getSalary();
    }

}
