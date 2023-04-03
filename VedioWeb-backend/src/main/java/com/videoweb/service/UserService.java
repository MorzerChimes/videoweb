package com.videoweb.service;

import com.videoweb.entity.User;
import com.videoweb.mapper.UserMapper;
import com.videoweb.service.impl.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserService implements IUserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> listUsers() {
        return userMapper.listUsers();
    }
}
