package com.rk.campus.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rk.campus.model.Person;
import com.rk.campus.model.User;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
public class Login {
    @PostMapping
    public  boolean login(@RequestBody Person person) {
        System.out.println("Inside login in Login.");
        System.out.println(person.getId());
        System.out.println(person.getPassword());
        System.out.println(person.getRole());
        if (person.getId().equals("0") && person.getPassword().equals("root") && person.getRole().equals("admin")) {
            System.out.println("User logged in.");
            System.out.println("User id: " + person.getId());
            System.out.println("User role: " + person.getRole());
            return true;
        } else {
            return false;
        }
    }
}
