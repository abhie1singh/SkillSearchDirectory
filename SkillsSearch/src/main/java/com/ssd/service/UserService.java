package com.ssd.service;

import java.util.List;

import com.ssd.entity.User;

public interface UserService{
    
	List<User> findAllUsers(); 
	
	User findByUserSid(String userSid);
	
	User findByEmail(String email);
	
	Boolean checkLogin(String email, String password);
}
