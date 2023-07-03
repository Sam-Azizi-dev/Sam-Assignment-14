package com.CodersCampus.assignment14.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CodersCampus.assignment14.domain.User;
import com.CodersCampus.assignment14.serrvice.UserServices;

@Controller
public class UserController {
    
    @Autowired
    private UserServices userService;
    
    @GetMapping("/wellcome")
    public String showWelcomePage() {
        return "wellcome";
    }
    
    @PostMapping("/wellcome")
    public String registerUser(@RequestParam("name") String name, HttpSession session) {
        User user = new User(name);
        userService.addUser(user);
        session.setAttribute("userId", user.getUserId());
        
        return "redirect:/channels";
    }
}
