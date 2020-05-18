package com.sanidhya.accountManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/* The class implements CommandLineRunner Interface that 
   allows to execute the run() method as the application starts
   hence loading the database.
*/

@RestController
public class AccountController {

	@Autowired
	private UserRepository dataRepository;

	// GET method to get all users

	@GetMapping("/users")
	List<Users> getAllUsers() {
		return dataRepository.findAll();
	}

	// GET method to get one user

	@GetMapping("/users/{id}")
	Users getUser(@PathVariable Long id) {
		return dataRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	// POST method

	@PostMapping("/users")
	Users createNewUser(@RequestBody Users new_user) {
		return dataRepository.save(new_user);
	}
}
