package com.rnd.springoauth2;

import org.springframework.security.core.userdetails.User;

public class CustomUserSecurity extends User {

	private static final long serialVersionUID = -1l;
	
	public CustomUserSecurity(UserModel userModel) {
		super(userModel.getUsername(), userModel.getPassword(), userModel.getGrantedAuthorities());
	}
	
}
