package com.ssd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ssd.dao.UserProfileRepository;
import com.ssd.dao.UserRepository;
import com.ssd.entity.User;
import com.ssd.entity.UserProfile;

@Service
@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
public class UserServiceJpaImpl implements UserService {

	@Autowired
    private UserRepository userRepository;
    
	@Autowired
	private UserProfileRepository userProfileRepository;

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User findByUserSid(String userSid) {
		// TODO Auto-generated method stub
		User user = userRepository.findByUserSid(userSid);
		UserProfile userProfile = userProfileRepository.findByUserSid(userSid);
		user.setUserProfile(userProfile);
		return user;
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email);
	}

	@Override
	public Boolean checkLogin(String email, String password) {
		User user = userRepository.findByEmailAndPassword(email, password);
		if(user == null){
			return false;
		}else{
			return true;
		}
	}
}
