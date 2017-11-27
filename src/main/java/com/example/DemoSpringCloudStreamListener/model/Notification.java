package com.example.DemoSpringCloudStreamListener.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Notification implements Serializable{

    @JsonProperty(value = "email")
    private String email;
    @JsonProperty(value = "message")
    private String message;

    public Notification() {}

    public Notification(String email, String message) {
        this.email = email;
        this.message = message;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
