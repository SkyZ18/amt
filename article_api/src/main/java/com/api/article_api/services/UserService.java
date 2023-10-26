package com.api.article_api.services;

import com.api.article_api.models.UserModel;
import com.api.article_api.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public ResponseEntity<List<UserModel>> getAll() {
        return ResponseEntity.ok(userRepository.findAll());
    }

}
