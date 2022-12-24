package com.organization.jwtserver.service;

import com.organization.jwtserver.domain.User;
import io.jsonwebtoken.Claims;

import java.security.Key;

public interface JwtProvider {

    String generateAccessToken(User user);

    String generateRefreshToken(User user);

    boolean validateAccessToken(String accessToken);

    boolean validateRefreshToken(String refreshToken);

    boolean validateToken(String token, Key secret);

    Claims getAccessClaims(String token);

    Claims getRefreshClaims(String token);

    Claims getClaims(String token, Key secret);

}
