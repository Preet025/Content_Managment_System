package com.upsc.contentmgmt;

import com.upsc.contentmgmt.model.Role;
import com.upsc.contentmgmt.model.User;
import com.upsc.contentmgmt.model.UserRole;
import com.upsc.contentmgmt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ContentmgmtApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(ContentmgmtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Starting Code");

//		User user = new User();
//
//		user.setFirstName("Abhishek");
//		user.setLastName("Lamba");
//		user.setUsername("abhipreet025");
//		user.setPassword("abc");
//		user.setEmail("abhisheklamba@gmail.com");
//		user.setPhone("9310430487");
//		user.setProfile("default.png");
//
//		Role role1 = new Role();
//		role1.setRoleId(55L);
//		role1.setRoleName("ADMIN");
//
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole = new UserRole();
//
//		userRole.setRole(role1);
//
//		userRole.setUser(user);
//
//		userRoleSet.add(userRole);
//
//		User user1 = this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());

	}
}
