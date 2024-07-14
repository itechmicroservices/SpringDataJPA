package com.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpa.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
