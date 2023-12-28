package com.employeemanagementsystem.employeemanagementsystem.repository;

import org.apache.ibatis.annotations.Mapper;

import com.employeemanagementsystem.employeemanagementsystem.model.AccountModel;

@Mapper
public interface AccountAuthenticationRepository {
	public AccountModel searchByUsername(String username);
}
