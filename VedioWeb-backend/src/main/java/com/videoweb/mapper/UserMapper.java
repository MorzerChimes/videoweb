package com.videoweb.mapper;

import com.videoweb.entity.User;
import com.videoweb.request.LoginRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> listUsers();
    User getUserByNumAndPsw(LoginRequest request);
}
