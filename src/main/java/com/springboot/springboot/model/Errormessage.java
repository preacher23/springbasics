package com.springboot.springboot.model;

import org.springframework.http.HttpStatus;

public class Errormessage {
    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private HttpStatus status;
    private String message;

    public Errormessage() {
    }

    public Errormessage(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }
}
