package com.example;
 import java.util.List;

import com.example.*;
public interface service {
	
	
	 MainUser findById(long id);

	List<MainUser> findAllUsers();
    MainUser deleteById(long id);

	 void updateData(MainUser user);
}
