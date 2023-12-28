package com.employeemanagementsystem.employeemanagementsystem.service;

import java.util.List;

import com.employeemanagementsystem.employeemanagementsystem.model.EmployeeModel;

public interface EmployeeService {

	public String insertEmpData(EmployeeModel empModel);
	public String deleteEmpData(int emp_id);
	public List<EmployeeModel> empList();
	public EmployeeModel searchByEmpName(String emp_name);
	public String updateEmpData(EmployeeModel empModel);
}
