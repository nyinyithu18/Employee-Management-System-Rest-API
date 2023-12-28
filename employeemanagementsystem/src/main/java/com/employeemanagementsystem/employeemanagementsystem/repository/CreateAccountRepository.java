package com.employeemanagementsystem.employeemanagementsystem.repository;

import org.apache.ibatis.annotations.Mapper;

import com.employeemanagementsystem.employeemanagementsystem.model.AccountModel;

@Mapper
public interface CreateAccountRepository {

	public int createUserAccount(AccountModel account);
	public int createAuthority(AccountModel account);
}
