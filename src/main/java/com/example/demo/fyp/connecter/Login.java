package com.example.demo.fyp.connecter;

import com.example.demo.fyp.entity.User;
import com.example.demo.fyp.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping({"/user"})
@RestController

public class Login {

    @Autowired
    private UserMapper userMapper;
    @GetMapping({"/login"})
    public List<User> login(String username, String password) {
        return userMapper.findAll();
    }

    @PostMapping({"/"})
    public Integer insert(@RequestBody User user){
        // RequestBody 是把前段传输过来的字段（Json）转换成我们java下的类，自动填充
        System.out.println(user.getWechatID());
        System.out.println(user.getUserName());
        return userMapper.insert(user);
    }

    @GetMapping({"/logout"})
    public String logout(String username, String password) {
        return "{\n \"msg\": " + username + " \"success\": \"token\":" + password + "}";
    }


}
