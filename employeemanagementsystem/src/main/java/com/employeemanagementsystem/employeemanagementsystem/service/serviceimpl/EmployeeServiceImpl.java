package com.employeemanagementsystem.employeemanagementsystem.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagementsystem.employeemanagementsystem.model.EmployeeModel;
import com.employeemanagementsystem.employeemanagementsystem.repository.EmployeeRepository;
import com.employeemanagementsystem.employeemanagementsystem.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;
	
	@Override
	public String insertEmpData(EmployeeModel empModel) {
		int insertData = empRepository.insertEmpData(empModel);
		if(insertData == 1) {
			return "Insert Employee Data Successfully!";
		}else {
			return "Insert Employee Data Fail!\r\nPlease Try Again!";
		}
	}

	@Override
	public String deleteEmpData(int emp_id) {
		int deleteData = empRepository.deleteEmpData(emp_id);
		if(deleteData == 1) {
			return "Delete Employee Data Successfully!";
		}else {
			return "Delete Employee Data Fail!\r\nPlease Try Again!";
		}
	}

	@Override
	public List<EmployeeModel> empList() {
		return empRepository.empList();
	}

	@Override
	public EmployeeModel searchByEmpName(String emp_name) {
		return empRepository.searchByEmpName(emp_name);
	}

	@Override
	public String updateEmpData(EmployeeModel empModel) {
		int updateData = empRepository.updateEmpData(empModel);
		if(updateData == 1) {
			return "Update Employee Data Successfully!";
		}else {
			return "Update Employee Data Fail!\r\nPlease Try Again!";
		}
	}

}
