package com.organization.jwtserver.controller;

import com.organization.jwtserver.domain.JwtAuthentication;
import com.organization.jwtserver.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class Controller {

    private final AuthService authService;

    @PreAuthorize("hasAuthority('USER')")
    @GetMapping("greeting/user")
    public ResponseEntity<String> apiUser() {
        final JwtAuthentication authInfo = authService.getAuthInfo();
        return ResponseEntity.ok("Hello " + authInfo.getPrincipal());
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("greeting/admin")
    public ResponseEntity<String> apiAdmin() {
        final JwtAuthentication authInfo = authService.getAuthInfo();
        return ResponseEntity.ok("Hello " + authInfo.getPrincipal());
    }
}
