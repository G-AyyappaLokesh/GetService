package com.digit;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.digit.User;

@Service("userService")
public class userserviceimpl implements userservice {	

	private static List<User> users;
	
	static{
		users= DummyUsers();
	}
	public List<User> findAllUsers()
	{
		return users;
	}
	
	public User findById(long id)
	{
		for(User user:users)
		{
			if(user.getId()==id)
			{
				return user;
			}
				
		}
		
		
		return null;
	}

	private static List<User> DummyUsers(){
		List<User> users = new ArrayList<User>();
		users.add(new User(1,"lokesh",30000, "kakinada"));
		users.add(new User(2,"Sharuk",40000, "guntur"));
		users.add(new User(3,"Mahesh",45000, "Kuppam"));
		users.add(new User(4,"Rajesh",50000, "Hyd"));
		return users;
	}

}
