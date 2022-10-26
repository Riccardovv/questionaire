package com.questionaire.quetionairebackend.controller;

import com.questionaire.quetionairebackend.model.User;
import com.questionaire.quetionairebackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{username}")
    public List<User> getUsersByUsername(@PathVariable String username){
        return userService.findUserByUsername(username);
    }

    @PostMapping()
    public String saveUser(@RequestBody User user){
        userService.saveUser(user);
        return "New user registered";
    }
}
