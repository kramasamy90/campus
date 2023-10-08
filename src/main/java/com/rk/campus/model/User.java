package com.rk.campus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Setter @Getter
public class User {
    String id;
    String password;
    String role;
    private boolean loggedIn = false;

public User(String id, String password, String role){
        this.id = id;
        this.password = password;
        this.role = role;
    }
}
