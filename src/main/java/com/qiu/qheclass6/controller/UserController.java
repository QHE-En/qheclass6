package com.qiu.qheclass6.controller;

import com.qiu.qheclass6.entity.User;
import com.qiu.qheclass6.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/users")
    public List<User> findAll() {
        return userMapper.selectList(null);
    }
}