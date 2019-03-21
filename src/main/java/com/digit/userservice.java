package com.digit;
 import java.util.List;

import com.digit.*;
public interface userservice {
	
	
	 User findById(long id);

	List<User> findAllUsers();

}
