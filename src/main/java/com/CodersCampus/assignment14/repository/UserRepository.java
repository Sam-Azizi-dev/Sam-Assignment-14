package com.CodersCampus.assignment14.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.CodersCampus.assignment14.domain.User;

@Repository
public class UserRepository {

	private List<User> users = new ArrayList<>();
	Integer userId = 0;
	public void addUser(User user) {
		user.setUserId(userId++);
		users.add(user);
	}

}
