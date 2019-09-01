package com.rnd.springoauth2;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public UserModel getUserByUsername(String username) {
		Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
		String sql = "select * from USERS where username =?";
		List<UserModel> usersList = jdbcTemplate.query(sql, new String[]{username}, 
				(ResultSet rs, int rowNum) -> {
					UserModel user = new UserModel();
					user.setUsername(username);
					user.setPassword(rs.getString("password"));
					return user;
				});
		
		
		if (usersList.size() > 0 && usersList!=null) {
			GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ROLE_SYSTEMADMIN");
			grantedAuthorities.add(grantedAuthority);
			usersList.get(0).setGrantedAuthorities(grantedAuthorities);
			return usersList.get(0);
		}
		
		return null;
	}
}
