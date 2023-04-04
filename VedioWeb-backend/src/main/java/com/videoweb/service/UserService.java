package com.videoweb.service;

import com.videoweb.dto.LoginDTO;
import com.videoweb.entity.User;
import com.videoweb.exception.ServiceException;
import com.videoweb.mapper.UserMapper;
import com.videoweb.request.LoginRequest;
import com.videoweb.service.impl.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
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

    @Override
    public LoginDTO login(LoginRequest request){
        User user =  userMapper.getUserByNumAndPsw(request);
        if (user == null) {
            throw new ServiceException("用户名或密码错误");
        }
        LoginDTO loginDTO = new LoginDTO();
        BeanUtils.copyProperties(user, loginDTO);
        return loginDTO;
    }
}
