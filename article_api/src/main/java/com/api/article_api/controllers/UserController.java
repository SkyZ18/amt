package com.api.article_api.controllers;

import com.api.article_api.models.UserModel;
import com.api.article_api.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users/register/{email}&{password}")
    private ResponseEntity<UserModel> createUser(@PathVariable("email") String email, @PathVariable("password") String password) {
        return userService.postUser(email, password);
    }

    @GetMapping("/users/login/{email}&{password}")
    private Boolean loginUser(@PathVariable("email") String email, @PathVariable("password") String password) {
        return userService.findByEmailAndPassword(email, password);
    }

    @DeleteMapping("/users/delete/{id}&{email}")
    private String deleteUser(@PathVariable("id") Long id, @PathVariable("email") String email) {
        return userService.deleteUserByEmailAndPassword(id, email);
    }
}
