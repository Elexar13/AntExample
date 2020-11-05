package com.company.beans;

import java.io.Serializable;

public class UserBean implements Serializable {
    private String username;

    public UserBean() {

    }

    public String getUsername() {
        if (username == null) return "";
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
