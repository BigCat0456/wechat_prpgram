package com.example.demo.fyp.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.fyp") // fyp 包下的文件就是用来做请求的了
public class SpringMvcConfig {
    
}
