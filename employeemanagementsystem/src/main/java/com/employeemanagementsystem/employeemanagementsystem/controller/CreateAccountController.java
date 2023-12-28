package com.employeemanagementsystem.employeemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagementsystem.employeemanagementsystem.model.AccountModel;
import com.employeemanagementsystem.employeemanagementsystem.service.serviceimpl.CreateAccountServiceImpl;

import io.swagger.annotations.Api;

@Api(tags = "Create Account Controller")
@RestController
public class CreateAccountController {

	@Autowired
	private CreateAccountServiceImpl createAccServiceImpl;
	
	@RequestMapping(value = "/createAccount", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String cerateAccount(@ModelAttribute AccountModel accountModel) {
		return createAccServiceImpl.createAccount(accountModel);
	}
}
