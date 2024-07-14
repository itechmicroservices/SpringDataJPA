package com.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpa.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
