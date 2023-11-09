package com.api.article_api.controllers;

import com.api.article_api.models.UserModel;
import com.api.article_api.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/getAll")
    public ResponseEntity<List<UserModel>> getAllUsers() {
        return userService.getAll();
    }

}
