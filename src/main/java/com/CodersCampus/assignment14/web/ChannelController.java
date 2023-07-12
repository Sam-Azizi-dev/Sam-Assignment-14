package com.CodersCampus.assignment14.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.CodersCampus.assignment14.Services.ChannelService;
import com.CodersCampus.assignment14.Services.MessageService;
import com.CodersCampus.assignment14.Services.UserServices;
import com.CodersCampus.assignment14.domain.Channel;
import com.CodersCampus.assignment14.domain.Message;

@Controller
public class ChannelController {
		@Autowired
		 private  UserServices userService;
		@Autowired
		private  ChannelService channelService;
		@Autowired
		private  MessageService messageService;
		
	  @GetMapping("/channels")
	  public String showChannelPage(@PathVariable("name") String name, Model model) {
	        Channel channel = channelService.getChannelByName(name);
	        List<Message> messages = messageService.getMessagesByChannel(channel);
	        model.addAttribute("channel", channel);
	        model.addAttribute("messages", messages);
	        model.addAttribute("newMessage", new Message());
	        return "channel";
	    }
	    
	    @GetMapping("/channels/{channelId}")
	    public String showChannelPage(@PathVariable("channelId") Long channelId, HttpSession session) {
	        Object userId = session.getAttribute("userId");
	        if (userId == null) {
	            return "redirect:/";
	        }
	        
	        // Handle the channel page logic
	        
	        return "channel";
	    }
}
