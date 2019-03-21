package com.digit.lokesh;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.digit.*;
import com.digit.*;

@RestController
public class mycontroller {
	@Autowired
	userservice userService;
	
	public static final Logger logger = LoggerFactory.getLogger(mycontroller.class);
	
	@GetMapping(value = "/user/{id}")
	public ResponseEntity<?>getuser(@PathVariable("id")long id)
	{
		
		
		logger.info("fetching by id",id);
		User user=userService.findById(id);
		if (user == null) {
			logger.error("User with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType("User with id " + id 
					+ " not found"), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<User>(user, HttpStatus.OK);
		
		
		
	}
	@GetMapping(value="/user/")
	public ResponseEntity<List<User>> listAllUsers() {
		List<User> users = userService.findAllUsers();
		if (users.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
	
	@GetMapping(value="/welcome")
	public String get()
	{
	return "hello lokesh";
	}
	

	
	
	
	
	

}
