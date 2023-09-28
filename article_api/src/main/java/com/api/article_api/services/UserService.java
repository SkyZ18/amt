package com.api.article_api.services;

import com.api.article_api.models.UserModel;
import com.api.article_api.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public ResponseEntity<UserModel> postUser(String email, String password) {
        UserModel usermodel = new UserModel();

        if(userRepository.findByEmail(email).isPresent()) throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        else {
            usermodel.email = email;
            usermodel.password = password;

            return ResponseEntity.ok(userRepository.save(usermodel));
        }
    }

    public Boolean findByEmailAndPassword(String email, String password) {

        boolean status = false;
        if(userRepository.findByEmail(email).isPresent()) if(userRepository.findByPassword(password).isPresent()) status = true;

        return status;
    }

    public String deleteUserByEmailAndPassword(Long id, String email) {
        if(userRepository.findByEmail(email).isPresent()) userRepository.deleteById(id);
        else throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return "Deleted User Successfully";
    }
}
