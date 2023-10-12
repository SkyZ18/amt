package com.api.article_api.services;

import com.api.article_api.models.UserModel;
import com.api.article_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserModel> getAllUsersInDatabase() {
        return userRepository.findAll();
    }

}
