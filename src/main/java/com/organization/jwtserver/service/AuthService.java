package com.organization.jwtserver.service;

import com.organization.jwtserver.domain.JwtAuthentication;
import com.organization.jwtserver.domain.JwtRequest;
import com.organization.jwtserver.domain.JwtResponse;
import com.organization.jwtserver.exception.AuthException;

public interface AuthService {

    /**
     * Авторизация пользователей и получение токенов
     * @param authRequest {@link JwtRequest} c логином и паролем
     * @return {@link JwtResponse} с токенами
     * @throws AuthException если пользователь не найден или пароль неверный
     */
    JwtResponse login(JwtRequest authRequest);

    /**
     * Валидация refresh-токена и получение access-токена
     * @param refreshToken строка с refresh-токен
     * @return {@link JwtResponse} с access-токен
     * @throws AuthException если пользователь не найден
     */
    JwtResponse getAccessToken(String refreshToken);

    /**
     * Валидация и получение нового refresh-токена
     * @param refreshToken строка с refresh-токен
     * @return {@link JwtResponse} с access-токен и новым refresh-токен
     * @throws AuthException если пользователь не найден или refresh-токен не валидный
     */
    JwtResponse refresh(String refreshToken);

    JwtAuthentication getAuthInfo();
}
