package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.users;
import com.repository.userRepository;

@Service
public class userService {

	
	@Autowired
	userRepository usrep;
	
	public users saveUser(users ur) {
		
		return usrep.save(ur);
		
		
		
				}
}
