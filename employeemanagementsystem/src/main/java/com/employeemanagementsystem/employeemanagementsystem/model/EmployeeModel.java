package com.employeemanagementsystem.employeemanagementsystem.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

public class EmployeeModel {

	@Getter
	@Setter
	private int emp_id;
	
	@Getter
	@Setter
	@Size(min = 5, max = 20 , message = "Employee name should be min 5 and max 20 characters!")
	@NotEmpty(message = "Emplyee name Should be Not Empty!")
	private String emp_name;
	
	@Getter
	@Setter
	@Min(value = 150000 , message = "Employee Salary should be min 150000!")
	private int emp_salary;
	
	@Getter
	@Setter
	@NotEmpty(message = "Emplyee position Should be Not Empty!")
	private String position;
	
	@Getter
	@Setter
	@NotEmpty(message = "Emplyee contant Should be Not Empty!")
	private String contant;
}
