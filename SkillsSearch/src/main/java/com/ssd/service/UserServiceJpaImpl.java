package com.ssd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ssd.dao.LocationRepository;
import com.ssd.dao.UserProfileRepository;
import com.ssd.dao.UserRepository;
import com.ssd.entity.Location;
import com.ssd.entity.User;
import com.ssd.entity.UserProfile;

@Service
@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
public class UserServiceJpaImpl implements UserService {

	@Autowired
    private UserRepository userRepository;
    
	@Autowired
	private UserProfileRepository userProfileRepository;
	
	@Autowired
	private LocationRepository locationRepository;

	@Override
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User findByUserSid(String userSid) {
		User user = userRepository.findByUserSid(userSid);
		if(null != user){
			UserProfile userProfile = userProfileRepository.findByUserSid(userSid);
			user.setUserProfile(userProfile);
			Location location = locationRepository.findLocationByLocationId(userProfile.getLocationId());
			user.setLocation(location);
		}
		return user;
	}

	@Override
	public User findByEmail(String email) {
		User user = userRepository.findByEmail(email);
		UserProfile userProfile = userProfileRepository.findByUserSid(user.getUserSid());
		user.setUserProfile(userProfile);
		return user;
	}

	@Override
	public User checkLogin(String email, String password) {
		User user = userRepository.findByEmailAndPassword(email, password);
		if(null != user){
			UserProfile userProfile = userProfileRepository.findByUserSid(user.getUserSid());
			user.setUserProfile(userProfile);
		}
		return user;
	}
	
	
}
