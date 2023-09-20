package com.api.article_api.services;

import com.api.article_api.models.UserModel;
import com.api.article_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<UserModel> postUser(String email, String password) {
        UserModel usermodel = new UserModel();

        if(userRepository.existsByEmail(email)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }else {
            usermodel.email = email;
            usermodel.password = password;

            return ResponseEntity.ok(userRepository.save(usermodel));
        }
    }

    public Boolean findByEmailAndPassword(String email, String password) {

        boolean status = false;
        if(userRepository.existsByEmail(email)) {
            if(userRepository.existsByPassword(password)) status = true;
        }
        return status;
    }

    public String deleteUserByEmailAndPassword(Long id, String email) {
        if(userRepository.existsByEmail(email)) userRepository.deleteById(id);
        else throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return "Deleted User Successfully";
    }
}
