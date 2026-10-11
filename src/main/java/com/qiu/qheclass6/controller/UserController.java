package com.qiu.qheclass6.controller;

import com.qiu.qheclass6.common.Result;
import com.qiu.qheclass6.entity.User;
import com.qiu.qheclass6.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping
    public Result<List<User>> findAll(){
        List<User> list = userMapper.selectList(null);
        return Result.success(list);
    }

    @PostMapping
    public Result<Void> insert(@RequestBody User user){
        userMapper.insert(user);
        return Result.success();
    }

    @PutMapping
    public Result<Void> update(@RequestBody User user){
        userMapper.updateById(user);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result<Void> delete(@PathVariable Integer id){
        userMapper.deleteById(id);
        return Result.success();
    }
}