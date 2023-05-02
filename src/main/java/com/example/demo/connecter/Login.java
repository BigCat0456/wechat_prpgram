package com.example.demo.connecter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping({"/sms"})
@RestController

public class Login {

    @GetMapping({"/login"})
    public String login(String username, String password) {
        return "{\n \"msg\":   \"success\": \"token\":" + password + "}";
    }

    @GetMapping({"/logout"})
    public String logout(String username, String password) {
        return "{\n \"msg\":   \"success\": \"token\":" + password + "}";
    }

    


}
