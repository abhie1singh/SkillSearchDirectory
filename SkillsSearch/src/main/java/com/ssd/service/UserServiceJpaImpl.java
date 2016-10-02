package com.ssd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ssd.dao.UserRepository;
import com.ssd.entity.User;

@Service
@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
public class UserServiceJpaImpl implements UserService {

    private final UserRepository userRepository;
    
    @Autowired
    public UserServiceJpaImpl(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User findByUserSid(String userSid) {
		// TODO Auto-generated method stub
		return userRepository.findByUserSid(userSid);
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email);
	}
}
