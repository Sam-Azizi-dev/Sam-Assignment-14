package com.CodersCampus.assignment14.domain;

import java.util.List;

public class Channel {
	private String name;
	private List<Message> messages;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public Channel(String name, List<Message> messages) {
		this.name = name;
		this.messages = messages;
	}

}
