package com.rk.campus.api;

import com.rk.campus.model.api.PasswordChanger;
import com.rk.campus.model.api.User;
import com.rk.campus.model.db.Users;
import com.rk.campus.service.db.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class GetName {
    UsersService usersService;
    @Autowired
    public GetName(UsersService usersService) {
        this.usersService = usersService;
    }
    @GetMapping("/getName")
    public String getName(@RequestBody User user) {
        Optional<Users> optionalUsers = usersService.findById(user.getId());
        if(optionalUsers.isEmpty()){
            return "User not found";
        }
        Users users = optionalUsers.get();
        if(!users.getPassword().equals(user.getPassword())){
            return "Wrong password";
        } else{
            return users.getName();
        }
    }
    @PutMapping("/changePassword")
    public String changePassword(@RequestBody PasswordChanger passwordChanger) {
        Optional<Users> optionalUsers = usersService.findById(passwordChanger.getId());
        if(optionalUsers.isEmpty()){
            return "User not found";
        }
        Users users = optionalUsers.get();
        if(!users.getPassword().equals(passwordChanger.getPassword())){
            return "Wrong password";
        } else{
            users.setPassword(passwordChanger.getNewPassword());
            usersService.save(users);
            return "Password changed";
        }
    }
}
