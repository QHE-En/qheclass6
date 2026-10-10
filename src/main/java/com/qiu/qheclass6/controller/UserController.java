package com.qiu.qheclass6.controller;

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
    public List<User> findAll(){
        return userMapper.selectList(null);
    }

    @PostMapping
    public String insert(@RequestBody User user){
        userMapper.insert(user);
        return "新增成功";
    }

    @PutMapping
    public String update(@RequestBody User user){
        userMapper.updateById(user);
        return "修改成功";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        userMapper.deleteById(id);
        return "删除成功";
    }
}