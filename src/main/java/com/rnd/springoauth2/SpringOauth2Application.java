package com.rnd.springoauth2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableAuthorizationServer
public class SpringOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringOauth2Application.class, args);
	}

}

@Component
class CommandData implements CommandLineRunner {

	
	@Autowired
	private UserDAO userdao;
	
	@Override
	public void run(String... args) throws Exception {
		UserModel userByUsername = userdao.getUserByUsername("agent01");
		if (userByUsername == null) {
			System.out.println("DATA TIDAK ADA");
		}else {
			System.out.println("DATA ADA");
			System.out.print("USERNAME : " + userByUsername.getUsername()+"\n");
			System.out.print("PASSWORD : " + userByUsername.getPassword()+"\n");
			System.out.print("GRANT : " + userByUsername.getGrantedAuthorities()+"\n");
		}
	}
	
}
