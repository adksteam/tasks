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
public class AccountController implements CommandLineRunner {

	@Autowired
	private UserRepository dataRepository;

	//This method initially populates the database.
	
	@Override
	public void run(String... args) {
		dataRepository.save(new User("Raghav", "raghav32@gmail.com", "Standard"));
		dataRepository.save(new User("John", "john87guetta@yahoo.com", "Premium"));
		dataRepository.save(new User("Anjali", "anj65@gmail.com", "Standard"));
	}

	// GET method to get all users

	@GetMapping("/users")
	List<User> getAllUsers() {
		return dataRepository.findAll();
	}

	// GET method to get one user

	@GetMapping("/users/{id}")
	User getUser(@PathVariable Long id) {
		return dataRepository.findById(id).orElseThrow(()-> new UserNotFoundException(id));
	}

	// POST method

	@PostMapping("/users")
	User createNewUser(@RequestBody User new_user) {
		return dataRepository.save(new_user);
	}
}
