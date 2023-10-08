package com.rk.campus.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {
    String id;
    String password;

    public User(@JsonProperty("id") String id, @JsonProperty("password") String password) {
        this.id = id;
        this.password = password;
    }
}
