package com.springjpa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.entity.Book;
import com.springjpa.entity.User;
import com.springjpa.repository.UserRepository;

@RestController
@RequestMapping("/onetomany")
public class OneToManyController {

	@Autowired
	private UserRepository dataRepository;
	
	@PostMapping
	public Optional<User> dataMethod() {
		User user=new User();
		//user.setId(1L);
		user.setName("sanket");

		
		
		Book book1=new Book();
		book1.setBookName("java");
		book1.setUser(user);
		
		Book book2=new Book();
		book2.setBookName("C++");
		book2.setUser(user);
		
		List<Book> books=new ArrayList<>();
		books.add(book1);
		books.add(book2);
		
		
		user.setBook(books);

		dataRepository.save(user);
		
//		Optional<User> user1=dataRepository.findById(1L);
//		System.out.println(user1.get().getAddress().getUser_address());
		
		return null;

	}
	
}
