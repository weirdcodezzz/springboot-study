package com.luo.jpa.controller;

import java.util.Optional;

import com.luo.jpa.entity.User;
import com.luo.jpa.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author luo Fuqiang
 * @date 2020/12/22 14:33
 */
@RestController
public class UserController {

    UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id){
        Optional<User> user = userRepository.findById(id);
        User result = user.orElse(new User(-1, "没有该用户", "error@com"));
        return result;
    }


    @PostMapping("/user")
    public User insertUser(@RequestBody User user){
        User result = userRepository.save(user);
        return result;
    }
}
