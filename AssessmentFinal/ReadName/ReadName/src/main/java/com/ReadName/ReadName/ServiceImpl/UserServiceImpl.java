package com.ReadName.ReadName.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ReadName.ReadName.Model.User;
import com.ReadName.ReadName.Repository.UserRepo;
import com.ReadName.ReadName.Service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
    private UserRepo userRepo;  
    
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public Optional<User> getUserById(Long userId) {
		// TODO Auto-generated method stub
		return userRepo.findById(userId);
	}
}
