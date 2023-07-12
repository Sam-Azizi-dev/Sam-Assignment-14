package com.CodersCampus.assignment14.repository;

import com.CodersCampus.assignment14.domain.User;

public interface UserRepository {
	  User save(User user);
	    User findByName(String name);
}
