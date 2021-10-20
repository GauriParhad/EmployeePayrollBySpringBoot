package com.bridgelabz.Employeepayroll.dto;

import javax.validation.constraints.Min;
import lombok.Data;
import org.intellij.lang.annotations.Pattern;

/**
 * Receive data object from clint
 *
 * @author Gauri Parhad
 * @since 10/10/2021
 */
@Data
public class EmpPayrollDto {

    @Pattern(regexp = "^[A-Z][a-zA-Z]{2,}$", message = "Employee name Invalid")
    public String name;
    @Min(value = 500, message = "Salary must be more than 500")
    public int salary;
}
