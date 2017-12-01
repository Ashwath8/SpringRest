package com.ash.spring.rest.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
// This is the Controller class
// Maps the HTTP requests to the appropriate UserService Methods
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	// Retrieves the user that matches the id provided
	@RequestMapping(method = RequestMethod.GET, value="/user/{user_id}")
	public Users getUser(@PathVariable String user_id){
	   return userService.getUser(user_id);
	}
	
	// Retrieves all the users stored in the database
	@RequestMapping(method = RequestMethod.GET, value = "/user")
	public List<Users> getAllUsers(){
		return userService.getAllUsers();
	}
	
	// Adds a user to the database
	@RequestMapping(method = RequestMethod.POST, value="/user")
	public Users addUser(@RequestBody Users user){
		return userService.addUser(user);
	}
	
	// Updates an existing user that is already stored in the database
	@RequestMapping(method = RequestMethod.PUT, value="/user/{user_id}")
	public void updateUser(@PathVariable String user_id, @RequestBody Users user){
		userService.updateUser(user_id, user);
	}
	
	// Deletes an existing user
	@RequestMapping(method = RequestMethod.DELETE, value="/user/{user_id}")
	public void deleteUser(@PathVariable String user_id){
		userService.deleteUser(user_id);
	}

}
