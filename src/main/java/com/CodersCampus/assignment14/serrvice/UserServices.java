package com.CodersCampus.assignment14.serrvice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CodersCampus.assignment14.domain.User;
import com.CodersCampus.assignment14.repository.UserRepository;

@Service
public class UserServices {

	@Autowired
	private UserRepository userRepo;
	
	public void addUser(User user) {
		userRepo.addUser(user);
	}

}
