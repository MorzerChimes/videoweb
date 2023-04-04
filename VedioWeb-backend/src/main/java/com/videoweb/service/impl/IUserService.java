package com.videoweb.service.impl;

import com.videoweb.dto.LoginDTO;
import com.videoweb.entity.User;
import com.videoweb.request.LoginRequest;

import java.util.List;

public interface IUserService {
    List<User> listUsers();
    LoginDTO login(LoginRequest request);
}
