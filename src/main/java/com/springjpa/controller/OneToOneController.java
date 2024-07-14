package com.springjpa.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.entity.Address;
import com.springjpa.entity.User;
import com.springjpa.repository.UserRepository;

@RestController
@RequestMapping("/onetoone")
public class OneToOneController {

	@Autowired
	private UserRepository dataRepository;
	
	@PostMapping
	public Optional<User> dataMethod() {
		User user=new User();
		//user.setId(1L);
		user.setName("sanket");
		Address address=new Address();
		address.setUser_address("Pune");
		address.setUser(user);
		user.setAddress(address);
		dataRepository.save(user);
		
//		Optional<User> user1=dataRepository.findById(1L);
//		System.out.println(user1.get().getAddress().getUser_address());
		
		return null;

	}
}
