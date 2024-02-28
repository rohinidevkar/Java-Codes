package com.ReadName.ReadName.Service;

import java.util.List;
import java.util.Optional;

import com.ReadName.ReadName.Model.User;


public interface UserService {
	User saveUser(User user);
    List<User> getAllUsers();
    Optional<User> getUserById(Long userId);
}
