package com.CodersCampus.assignment14.repository;

import java.util.List;

import com.CodersCampus.assignment14.domain.Channel;
import com.CodersCampus.assignment14.domain.Message;

public interface MessageRepository {
	 Message save(Message message);
	    List<Message> findByChannel(Channel channel);
}
