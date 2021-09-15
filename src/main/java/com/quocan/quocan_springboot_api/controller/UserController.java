package com.quocan.quocan_springboot_api.controller;

import com.quocan.quocan_springboot_api.entity.User;
import com.quocan.quocan_springboot_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @PostMapping
    public String createUser(@RequestBody User user){
        userService.saveUser(user);
        return "saved";
    }

    @GetMapping("/{id}")
    public User getUserById(Long id){
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public String updateUser(@RequestBody User user){
        userService.updateUserById(user);
        return "updated";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") long id){
        userService.deleteById(id);
        return "deleted";
    }
}
