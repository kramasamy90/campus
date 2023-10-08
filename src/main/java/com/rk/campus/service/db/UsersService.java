package com.rk.campus.service.db;

import com.rk.campus.dao.UsersRepository;
import com.rk.campus.model.db.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class UsersService {
    UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Users save(Users users) {
        return usersRepository.save(users);
    }

    public Optional<Users> findById(String id) {
        return usersRepository.findById(id);
    }

}
