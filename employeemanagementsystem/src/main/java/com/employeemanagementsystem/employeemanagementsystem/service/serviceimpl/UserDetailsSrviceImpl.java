package com.employeemanagementsystem.employeemanagementsystem.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.employeemanagementsystem.employeemanagementsystem.model.AccountModel;
import com.employeemanagementsystem.employeemanagementsystem.repository.AccountAuthenticationRepository;

@Service
public class UserDetailsSrviceImpl implements UserDetailsService {

	@Autowired
	private AccountAuthenticationRepository accAuthRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AccountModel account = accAuthRepository.searchByUsername(username);
		if(account == null) {
			throw new UsernameNotFoundException("Not Found Username" + username);
		}
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("ROLE_"+account.getAuthority()));
		return new User(account.getUsername(), account.getPassword(), authorities);
	}

}
