package com.employeemanagementsystem.employeemanagementsystem.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.employeemanagementsystem.employeemanagementsystem.model.EmployeeModel;

@Mapper
public interface EmployeeRepository {

	public int insertEmpData(EmployeeModel empModel);
	public int deleteEmpData(int emp_id);
	public List<EmployeeModel> empList();
	public EmployeeModel searchByEmpName(String emp_name);
	public int updateEmpData(EmployeeModel empModel);
}
