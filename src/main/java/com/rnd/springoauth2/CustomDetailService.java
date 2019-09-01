package com.rnd.springoauth2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomDetailService implements UserDetailsService{

	@Autowired
	private UserDAO userDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserModel userModel = userDao.getUserByUsername(username);
		CustomUserSecurity customUserSecurity = new CustomUserSecurity(userModel);
		//return customUserSecurity, karena customUserSecurity meng-extends class User dari security
		return customUserSecurity;
	}
}
