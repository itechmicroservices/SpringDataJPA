package com.springjpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.entity.Category;
import com.springjpa.entity.Product;
import com.springjpa.entity.User;
import com.springjpa.repository.CategoryRepository;


@RestController
@RequestMapping("manytomany")
public class ManyToManyController {

	@Autowired
	private CategoryRepository categoryRepository;

	
	@PostMapping
	public Optional<User> dataMethod() {

		Product p1=new Product();
		p1.setProductName("iphone 15");
		
		Product p2=new Product();
		p2.setProductName("Samsung Galexy");
		
		Product p3=new Product();
		p3.setProductName("Sony TV");
		
		Category c1=new Category();
		c1.setCategoryName("Electronics");
		
		Category c2=new Category();
		c2.setCategoryName("Mobile");
		
		Category c3=new Category();
		c3.setCategoryName("TV");
		
		
		List<Product> products1=c1.getProducts();
		products1.add(p1);
		products1.add(p2);
		products1.add(p3);
		
		List<Product> products2=c2.getProducts();
		products2.add(p1);
		products2.add(p2);
		
		List<Product> products3=c3.getProducts();
		products3.add(p3);
		
		categoryRepository.save(c1);
		categoryRepository.save(c2);
		categoryRepository.save(c3);
		
		
		
				
		
		return null;

	}
}
