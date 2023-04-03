package com.videoweb.common;

import lombok.Data;

@Data
public class Result {
    private String CODE;
    private String MESSAGE;
    private Object DATA;

    public void success(Object DATA) {
        this.setCODE("100");
        this.setDATA(DATA);
    }
    public void error(Object DATA) {
        this.setCODE("-1");
        this.setDATA(DATA);
    }
}
