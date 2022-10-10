package com.example.workwithdb.controller;

import com.example.workwithdb.User;
import com.example.workwithdb.entity.UsersEntity;
import com.example.workwithdb.repository.UsersRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    private final UsersRepository usersRepository;

    public UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping
    public List<User> getUsers() {
        List<UsersEntity> usersEntity = usersRepository.findAll();
        List<User> users = new ArrayList<>();

        for (UsersEntity userEntity : usersEntity) {
            User user = new User(userEntity.getName(), userEntity.getAge(), userEntity.getMale());

            users.add(user);
        }

        return users;
    }

    @PostMapping
    public String createUser() {
        return "Привет, мир!";
    }
}
