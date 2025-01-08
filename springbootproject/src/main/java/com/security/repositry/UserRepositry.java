package com.security.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.user.User;


@Repository
public interface UserRepositry extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
