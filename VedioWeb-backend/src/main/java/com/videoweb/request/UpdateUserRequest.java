package com.videoweb.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class UpdateUserRequest {
    private int uid;
    private String username;
    private String avatar;
    private int sex;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GTM+8")
    private Date birthday;
    private String number;
    private String password;
}
