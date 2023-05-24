package com.example.demo.fyp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    // Request 是用来处理请求的
    @RequestMapping("/save")
    public void save() {
        System.out.println("user save ...");
    }
}
