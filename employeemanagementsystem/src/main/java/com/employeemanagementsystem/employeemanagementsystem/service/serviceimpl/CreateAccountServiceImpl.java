package com.employeemanagementsystem.employeemanagementsystem.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.employeemanagementsystem.employeemanagementsystem.model.AccountModel;
import com.employeemanagementsystem.employeemanagementsystem.repository.CreateAccountRepository;
import com.employeemanagementsystem.employeemanagementsystem.service.CreateAccountService;

@Service
public class CreateAccountServiceImpl implements CreateAccountService {

	@Autowired
	private CreateAccountRepository createAccRepository;
	
	@Override
	public String createAccount(AccountModel accountModel) {
		int createOwnerAcc = 0;
		int createAuthority = 0;
		accountModel.setEnabled(true);
		accountModel.setPassword(new BCryptPasswordEncoder().encode(accountModel.getPassword()));
		createOwnerAcc = createAccRepository.createUserAccount(accountModel);
		createAuthority = createAccRepository.createAuthority(accountModel);
		
		int createOwnerAccountResult = createOwnerAcc + createAuthority;
		
		if(createOwnerAccountResult == 2) {
			return "Create Owner Account successfully!";
		}else {
			return "Create Owner Account Falied!\r\nPlease Try Again.";
		}
		
	}
}
