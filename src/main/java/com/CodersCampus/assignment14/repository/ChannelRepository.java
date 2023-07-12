package com.CodersCampus.assignment14.repository;

import java.util.List;

import com.CodersCampus.assignment14.domain.Channel;

public interface ChannelRepository {

	Channel save(Channel channel);
	    List<Channel> findAll();
	    Channel findByName(String name);
}
