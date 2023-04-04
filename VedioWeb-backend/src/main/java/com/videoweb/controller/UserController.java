package com.videoweb.controller;

import com.videoweb.common.Result;
import com.videoweb.dto.LoginDTO;
import com.videoweb.entity.User;
import com.videoweb.request.LoginRequest;
import com.videoweb.service.impl.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping("/list")
    public Result getUser(){
        List<User> users = userService.listUsers();
        Result result = new Result();
        result.success(users);
        return result;
    }

    @PostMapping("/login")
    public Result login(@RequestBody LoginRequest request){
        LoginDTO loginDTO = userService.login(request);
        return Result.success(loginDTO);
    }
}
