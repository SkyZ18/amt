package com.api.article_api.controllers;

import com.api.article_api.models.UserModel;
import com.api.article_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAll")
    public List<UserModel> getAllUsers() {
        return userService.getAllUsersInDatabase();
    }

}
