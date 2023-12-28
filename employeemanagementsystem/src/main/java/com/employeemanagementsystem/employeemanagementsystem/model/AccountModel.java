package com.employeemanagementsystem.employeemanagementsystem.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

public class AccountModel {

	@Getter
	@Setter
	@Size(min = 5, max = 20, message = "Username should be min 5 & max 20")
	@NotEmpty(message = "Username should be NotEmpty!")
	private String username;
	
	@Getter
	@Setter
	@Size(min = 5, max = 15, message = "Password should be min 5 & max 15")
	@NotEmpty(message = "Password should be NotEmpty!")
	private String password;
	
	@Getter
	@Setter
	private boolean enabled;
	
	@Getter
	@Setter
	@NotEmpty(message = "Authority should be NotEmpty!")
	private String authority;
}
