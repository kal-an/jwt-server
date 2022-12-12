package com.organization.jwtserver.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class Controller {

    private final AuthService authService;

    @GetMapping("auth/user")
    public ResponseEntity<String> apiUser() {
        return ResponseEntity.ok("");
    }

    @GetMapping("auth/user")
    public ResponseEntity<String> apiAdmin() {
        return ResponseEntity.ok("");
    }
}
