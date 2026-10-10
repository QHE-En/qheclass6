package com.qiu.qheclass6.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qiu.qheclass6.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}