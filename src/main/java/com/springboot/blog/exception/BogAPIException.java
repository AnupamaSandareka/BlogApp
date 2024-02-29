package com.springboot.blog.exception;

import org.springframework.http.HttpStatus;

public class BogAPIException extends RuntimeException{

    private HttpStatus status;
    private String message;

    public BogAPIException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public BogAPIException(String message, HttpStatus status, String message1) {
        super(message);
        this.status = status;
        this.message = message1;
    }
}
