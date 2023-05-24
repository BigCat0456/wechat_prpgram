package com.example.demo.fyp.mapper;

import com.example.demo.fyp.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();

    @Insert("INSERT into user(wechatID,username) VALUES (#{wechatID},#{userName})")
    int insert(User user);
}
