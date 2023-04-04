package com.videoweb.service.impl;

import com.videoweb.dto.LoginDTO;
import com.videoweb.dto.UpdateUserDTO;
import com.videoweb.entity.User;
import com.videoweb.request.LoginRequest;

import java.util.List;

public interface IUserService {
    //查询所有用户
    List<User> listUsers();

    //注册
    void register(User user);

    //通过uid注销用户
    void delUserByUid(Integer uid);

    //通过手机号注销用户
    void delUserByNum(String number);

    //通过uid更新用户信息
    UpdateUserDTO updateUserByUid(User user);

    //通过uid更改用户密码
    void updateUserPswByUid(User user);

    //通过手机号更新用户信息
    UpdateUserDTO updateUserByNum(User user);

    //通过手机号更改用户密码
    void updateUserPswByNum(User user);

    //通过uid查找用户
    User getUserByUid(Integer uid);

    //通过条件查找用户
    List<User> getUserByCon(String condition);

    //登录
    LoginDTO login(LoginRequest request);
}
