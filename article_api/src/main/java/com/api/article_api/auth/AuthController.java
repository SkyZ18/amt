package com.api.article_api.auth;

import com.api.article_api.dto.AuthenticationRequest;
import com.api.article_api.dto.AuthenticationResponse;
import com.api.article_api.dto.RegisterRequest;
import com.api.article_api.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> auth(
            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(service.authenticate(request));
    }
}
