package com.organization.jwtserver.service;

import com.organization.jwtserver.domain.JwtAuthentication;
import com.organization.jwtserver.domain.JwtRequest;
import com.organization.jwtserver.domain.JwtResponse;

public interface AuthService {

    JwtResponse login(JwtRequest authRequest);

    JwtResponse getAccessToken(String refreshToken);

    JwtResponse refresh(String refreshToken);

    JwtAuthentication getAuthInfo();
}
