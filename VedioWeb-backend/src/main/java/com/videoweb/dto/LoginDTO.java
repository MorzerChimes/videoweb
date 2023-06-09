package com.videoweb.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class LoginDTO {
    private int uid;
    private String username;
    private String avatar;
    private int sex;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GTM+8")
    private Date birthday;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GTM+8")
    private Date create_time;
}
