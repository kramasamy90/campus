package com.rk.campus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Person {
    private String id;
    private String role;
    private String password;

    public Person(@JsonProperty("id") String id, @JsonProperty("role") String role, @JsonProperty("password") String password) {
        this.id = id;
        this.role = role;
        this.password = password;
        System.out.println("Inside Person constructor.");
        System.out.println(id);
        System.out.println(role);
        System.out.println(password);
    }
}
