package com.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.repositry.UserRepositry;
import com.security.user.User;

@Service
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	private UserRepositry userRepositry;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepositry.findByEmail(username);
		if(user==null) {
			throw new UsernameNotFoundException("user not found");
		}
		return new CustomUserDetail(user);
	}

}
