package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.example.MainUser;

@Service("MyService")
public class userimpl implements service {	

	private static List<MainUser> users;
	
	static{
		users= DummyUsers();
	}
	public List<MainUser> findAllUsers()
	{
		return users;
	}
	
	public MainUser findById(long id)
	{
		for(MainUser user:users)
		{
			if(user.getId()==id)
			{
				return user;
			}
				
		}
		
		
		return null;
	}

	private static List<MainUser> DummyUsers(){
		List<MainUser> users = new ArrayList<MainUser>();
		users.add(new MainUser(1,"lokesh",30000, "kakinada"));
		users.add(new MainUser(2,"Sharuk",40000, "guntur"));
		users.add(new MainUser(3,"Mahesh",45000, "Kuppam"));
		users.add(new MainUser(4,"Rajesh",50000, "Hyd"));
		return users;
	}

}
