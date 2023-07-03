package com.CodersCampus.assignment14.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChannelController {

	  @GetMapping("/channels")
	    public String showChannelsPage() {
	        return "channels";
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
