package com.shen.springbootjpa.controller;


import com.shen.springbootjpa.entity.User;
import com.shen.springbootjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public Optional getUser(@PathVariable("id") Integer id){
        Optional<User> user = userRepository.findById(id);

        System.out.println(user);
        return user;
    }

    @GetMapping("/user")
    public User insertUser(User user){
        User save = userRepository.save(user);
        return save;
    }

}
