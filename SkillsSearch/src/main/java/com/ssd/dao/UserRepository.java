package com.ssd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssd.entity.User;


public interface UserRepository extends JpaRepository<User, String>{
	User findByUserSid(String userSid);
	
	User findByEmail(String email);
	
	User findByEmailAndPassword(String email, String password);
    
}
