package com.ash.spring.rest.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// Service class that interacts with the repository and fetches appropriate information
@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	// Return a single user matching the provided user_id string
	public Users getUser(String user_id) {
		 return userRepository.findOne(user_id);
	}
	// Returns a list of users stored in the database
	public List<Users> getAllUsers(){
		List<Users> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
	}
	// Adds a new user to the database
	public Users addUser(Users user){
		userRepository.save(user);
		return user;
	}
	// Updates an existing user in the database
	public Users updateUser(String user_id, Users user){
		userRepository.save(user);
		return user;
	}
	// Deletes an existing user in the database
	public void deleteUser(String user_id){
		userRepository.delete(user_id);
	}
	
}
