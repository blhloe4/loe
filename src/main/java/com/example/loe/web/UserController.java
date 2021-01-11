package com.example.loe.web;

import com.example.loe.domain.User;
import com.example.loe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    private List<User> listUser() {
        return userService.listUsers();
    }

    @PostMapping(value = "/")
    private String saveUser(@RequestBody User user) {
        userService.saveUser(user);
        return "success";
    }

    @PutMapping(value = "/{id}")
    private String updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        user.setId(id);
        userService.updateUser(user);
        return "success";
    }

    @DeleteMapping(value = "/{id}")
    private String deleteUser (@PathVariable("id") Long id ){
        userService.removeUser(id);
        return "success";
    }

}
