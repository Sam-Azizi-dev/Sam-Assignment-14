package com.CodersCampus.assignment14.domain;

public class User {
	private Integer userId;
	private String userName;

	public User(String name) {
		this.userName = name;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
