package com.erp.SpringSecurityNJWT.controller;


import com.erp.SpringSecurityNJWT.service.JWTService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private JWTService jwtService;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @PostMapping("/logout")
    public ResponseEntity<?> logout(HttpServletRequest request) {
        String header = request.getHeader("Authorization");

        if (header == null || !header.startsWith("Bearer ")) {
            return ResponseEntity.badRequest().body("Missing or invalid token");
        }

        String token = header.substring(7);
        Date expiration = jwtService.extractExpiration(token);

        // calculate TTL (time until token expiry)
        long ttl = Math.max(1, (expiration.getTime() - System.currentTimeMillis()) / 1000);

        // save in Redis blacklist
        redisTemplate.opsForValue().set("blacklist:" + token, "true", ttl, TimeUnit.SECONDS);

        return ResponseEntity.ok("User logged out successfully. Token blacklisted.");
    }
}
