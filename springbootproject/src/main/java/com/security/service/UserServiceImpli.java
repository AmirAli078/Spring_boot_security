package com.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.Dto.UserDto;
import com.security.repositry.UserRepositry;
import com.security.user.User;

@Service
public class UserServiceImpli implements UserService {

	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private UserRepositry userRepositry;
	@Override
	public User save(UserDto userDto) {
		// TODO Auto-generated method stub
		User user=new User(userDto.getEmail(),passwordEncoder.encode(userDto.getPassword()) , userDto.getRole(), userDto.getFullname());
		return userRepositry.save(user);
	}
	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
