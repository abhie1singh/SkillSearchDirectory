package com.ssd.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssd.entity.User;
import com.ssd.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	private final UserService userService;
	
	@Autowired
	public UserController(final UserService userService) {
	    this.userService = userService;
	}
			
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<List<User>> listAllUsers() {
		List<User> users = userService.findAllUsers();
		if(users.isEmpty()){
			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
	
	@RequestMapping(value = "sid/{sid}", method = RequestMethod.POST)
	public ResponseEntity<User> findUserBySid(@PathVariable("sid") final String sid) {
		User users = userService.findByUserSid(sid);
		if(users == null){
			return new ResponseEntity<User>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<User>(users, HttpStatus.OK);
	}
	
	@RequestMapping(value = "email/{email}", method = RequestMethod.POST)
	public ResponseEntity<User> findUserByEmail(@PathVariable("email") final String email) {
		User users = userService.findByEmail(email);
		if(users == null){
			return new ResponseEntity<User>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<User>(users, HttpStatus.OK);
	}

}
