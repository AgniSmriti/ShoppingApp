
package com.niit.backendproject.Backend.DAO;
import java.util.List;

import com.niit.backendproject.Backend.model.User;

public interface UserDAO {

	boolean addUser(User u);
	List<User>getAllUser();
	
}


