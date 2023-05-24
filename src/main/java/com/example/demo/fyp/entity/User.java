package com.example.demo.fyp.entity;


import lombok.AllArgsConstructor;
import lombok.Data;       // 简化代码
import lombok.NoArgsConstructor;

@Data     // @Dara    这个注解，就把这个类下面的属性都设置了getter和setter的函数
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer wechatID;
    private String userName;

}
