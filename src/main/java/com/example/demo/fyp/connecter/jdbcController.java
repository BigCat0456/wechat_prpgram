package com.example.demo.fyp.connecter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/sql"})
public class jdbcController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private String username = "";

    @PostMapping({"/register"})
    public String register(String username, String password) {
        return "123123";
    }

    @GetMapping({"/getUserInfo"})
    public String getString(String password) {
        String sql = "SHOW DATABASES";
        jdbcTemplate.execute(sql);
        this.username = "zhangwei";
        return this.username;
    }

}
