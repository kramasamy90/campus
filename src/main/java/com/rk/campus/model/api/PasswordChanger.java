package com.rk.campus.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rk.campus.model.api.User;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PasswordChanger extends User {
    String newPassword;
    public PasswordChanger(@JsonProperty("login-info") User user, @JsonProperty("newPassword") String newPassword) {
        super(user.getId(), user.getPassword());
        this.newPassword = newPassword;
    }
//    public PasswordChanger(@JsonProperty("id") String id, @JsonProperty("password") String password, @JsonProperty("newPassword") String newPassword) {
//        super(id, password);
//        this.newPassword = newPassword;
//    }
}
