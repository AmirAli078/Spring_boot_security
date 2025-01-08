package com.security.service;

import com.security.Dto.UserDto;
import com.security.user.User;

public interface UserService {

	User findByUsername(String username);
	User save(UserDto userDto);
	
}
