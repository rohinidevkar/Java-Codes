package com.ReadName.ReadName.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ReadName.ReadName.Model.User;


public interface UserRepo extends JpaRepository<User, Long>{

}
