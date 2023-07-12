package com.CodersCampus.assignment14.web;

import java.nio.channels.Channel;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CodersCampus.assignment14.Services.ChannelService;
import com.CodersCampus.assignment14.Services.UserServices;
import com.CodersCampus.assignment14.domain.User;

@Controller
public class UserController {

	@Autowired
	private UserServices userService;
	@Autowired
	private ChannelService channelService;
	
	List<Channel> channels = new ArrayList<>();

	@GetMapping("/wellcome")
	 public String showWelcomePage(ModelMap model) {
        model.addAttribute("user", new User());
        model.addAttribute("channels", channelService.getAllChannels());
        return "welcome";
    }

	@PostMapping("/wellcome")
	public String joinChannel(@ModelAttribute("user") User user) {
        userService.addUser(user);
        return "redirect:/channels/" + user.getName();
    }
	}
}
