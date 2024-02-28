package com.ReadName.ReadName.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ReadName.ReadName.Model.User;
import com.ReadName.ReadName.Service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userServe; 
	@PostMapping("/createuser")
    public User createUser(@RequestBody User user) {
		User users=userServe.saveUser(user);
        return users;
    }

    @GetMapping("/user")
    public List<User> getAllUsers() {
    	List<User> users=userServe.getAllUsers();
        return users;
    }

    @GetMapping("/user/{userId}")
    public Optional<User> getUserById(@PathVariable Long userId) {
        return userServe.getUserById(userId);
    }
}
