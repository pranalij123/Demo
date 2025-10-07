package com.erp.SpringSecurityNJWT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.erp.SpringSecurityNJWT.Entity.UserPrincipal;
import com.erp.SpringSecurityNJWT.Entity.Users;
import com.erp.SpringSecurityNJWT.repo.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		Users user = repo.findByUsername(username);
		if(user==null) {
			System.out.println("User Not Found");
			throw new UsernameNotFoundException("user not found");
		}
		return  new UserPrincipal(user);
	}

}
