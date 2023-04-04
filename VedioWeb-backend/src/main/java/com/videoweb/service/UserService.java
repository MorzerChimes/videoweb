package com.videoweb.service;

import com.videoweb.dto.LoginDTO;
import com.videoweb.entity.User;
import com.videoweb.exception.ServiceException;
import com.videoweb.mapper.UserMapper;
import com.videoweb.request.LoginRequest;
import com.videoweb.service.impl.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.utils.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class UserService implements IUserService {
    @Autowired
    UserMapper userMapper;

    //查询所有用户
    @Override
    public List<User> listUsers() {
        return userMapper.listUsers();
    }

    //注册
    @Override
    public void register(User user){
        Date date = new Date();
        user.setUsername(DateUtil.format(date, "yyyyMMdd"));
    }

    //通过uid注销用户

    //通过手机号注销用户

    //通过uid更新用户信息

    //通过uid更改用户密码

    //通过手机号更新用户信息

    //通过手机号更改用户密码

    //通过uid查找用户

    //通过条件查找用户

    //登录
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
