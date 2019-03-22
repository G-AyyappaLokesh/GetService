package com.example.lokesh;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.*;

@RestController
@RequestMapping("/rest")
public class mycontroller {
	@Autowired
	service Service;
	
	public static final Logger logger = LoggerFactory.getLogger(mycontroller.class);
	
	@GetMapping(value = "/user/{id}")
	public ResponseEntity<?>getuser(@PathVariable("id")long id)
	{
		
		
		logger.info("fetching by id",id);
		MainUser user=Service.findById(id);
		if (user == null) {
			logger.error("User with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType("User not available " + id 
				), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<MainUser>(user, HttpStatus.OK);
		
		
		
	}
	@GetMapping(value="/user/")
	public ResponseEntity<List<MainUser>> listAllUsers() {
		List<MainUser> users = Service.findAllUsers();
		if (users.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<MainUser>>(users, HttpStatus.OK);
	}
	@DeleteMapping(value="/user/{id}")
	public ResponseEntity<?>deleteuser(@PathVariable("id")long id)
	{
		logger.info("fetching with id",id);
		MainUser user=Service.findById(id);
		if(user==null)
		{
			logger.error("User with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType("User not available " + id 
				), HttpStatus.NOT_FOUND);
		
		}
		Service.deleteById(id);
		return new ResponseEntity("Deleted Successfully",HttpStatus.OK);
		
	}
	@PutMapping(value="/user/{id}")
	public ResponseEntity<?>updateuser(@PathVariable("id")long id,@RequestBody MainUser body)
	{
		logger.info("fetching with id",id);
		MainUser user=Service.findById(id);
		if(user==null)
		{
			logger.error("User with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType("User not available " + id 
				), HttpStatus.NOT_FOUND);
		
		}
		user.setName(body.getName());
		user.setPlace(body.getPlace());
		user.setSalary(body.getSalary());
		Service.updateData(user);
		return new ResponseEntity<MainUser>(user,HttpStatus.OK);		
	}
	
	
	@GetMapping(value="/welcome")
	public String get()
	{
	return "hello lokesh";
	}
	

	
	
	
	
	

}
