package com.employeemanagementsystem.employeemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagementsystem.employeemanagementsystem.model.EmployeeModel;
import com.employeemanagementsystem.employeemanagementsystem.service.serviceimpl.EmployeeServiceImpl;

import io.swagger.annotations.Api;

@Api(tags = "Employee Controller")
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl empServiceImpl;
	
	@RequestMapping(value = "insertEmpData", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String insertEmpData(@ModelAttribute EmployeeModel empModel) {
		return empServiceImpl.insertEmpData(empModel);
	}
	
	@RequestMapping(value = "deleteEmpData/{emp_id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String deleteEmpData(@PathVariable ("emp_id")String emp_id) {
		int empId = Integer.parseInt(emp_id);
		return empServiceImpl.deleteEmpData(empId);
	}
	
	@RequestMapping(value = "empList", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<EmployeeModel> empList () {
		return empServiceImpl.empList();
	}
	
	@RequestMapping(value = "searchByEmpId", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public EmployeeModel searchByEmpId(@RequestParam (name = "emp_name")String emp_name) {
		return empServiceImpl.searchByEmpName(emp_name);
	}
	
	@RequestMapping(value = "updateEmpData", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String updateEmpData(@RequestBody EmployeeModel empModel) {
		return empServiceImpl.updateEmpData(empModel);
	}
}
