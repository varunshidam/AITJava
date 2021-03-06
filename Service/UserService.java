package com.myait.Service;

import java.util.List;
import java.util.Optional;

import com.myait.Model.User;
import com.myait.View.UserView;

public interface UserService {
	
	//save
	public User saveEmployee(User employee);
	
	//update
	public User updateEmployee(User employee);

	//get all
	public List<User> showAll();
	
	// get one record
	public Optional<User> getEmployeeById(int user_id);
	
	
	//get by AIT-ID
	public User findByAit_id(String id);
	
	//get by Ait_id (4)
	public UserView findByAit_id11(String id);
	
	
 
	
}
