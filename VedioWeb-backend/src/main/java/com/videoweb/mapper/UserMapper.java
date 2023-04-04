package com.videoweb.mapper;

import com.videoweb.entity.User;
import com.videoweb.request.LoginRequest;
import com.videoweb.request.UpdateUserRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    //查询所有用户
    List<User> listUsers();

    //添加用户
    void addUser(User user);

    //通过uid删除用户
    void delUserByUid(Integer uid);

    //通过手机号删除用户
    void delUserByNum(String number);

    //通过uid更新用户信息
    User updateUserByUid(User user);

    //通过uid更改用户密码
    void updateUserPswByUid(User user);

    //通过手机号更新用户信息
    User updateUserByNum(User user);

    //通过手机号更改用户密码
    void updateUserPswByNum(User user);

    //通过uid查找用户
    User getUserByUid(Integer uid);

    //通过条件查找用户
    List<User> getUerByCon(String condition);

    //通过手机号和密码查询用户
    User getUserByNumAndPsw(LoginRequest request);


}
