package com.videoweb.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String number;
    private String password;
}
