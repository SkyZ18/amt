package com.api.article_api.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class JwtTokenProvider {
    private String jwtSecret;

    public String generateToken(String userEmail) {
        Instant now = Instant.now();
        Instant expiration = now.plus( 1, ChronoUnit.HOURS);

        return Jwts.builder()
                .setSubject(userEmail)
                .setIssuedAt(Date.from(now))
                .setExpiration(Date.from(expiration))
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
    }

    public boolean validateToken(String token) {

    }
}
