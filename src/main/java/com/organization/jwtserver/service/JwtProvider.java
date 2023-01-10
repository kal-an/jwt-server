package com.organization.jwtserver.service;

import com.organization.jwtserver.domain.User;
import io.jsonwebtoken.Claims;

import java.security.Key;

public interface JwtProvider {

    /**
     * Генерация access-токена для пользователя
     * @param user пользователь системы
     * @return строка с access-токен
     */
    String generateAccessToken(User user);

    /**
     * Генерация refresh-токена для пользователя
     * @param user пользователь системы
     * @return строка с refresh-токен
     */
    String generateRefreshToken(User user);

    /**
     * Валидация access-токена
     * @param accessToken строка с токеном
     * @return boolean
     */
    boolean validateAccessToken(String accessToken);

    /**
     * Валидация refresh-токена
     * @param refreshToken строка с токеном
     * @return boolean
     */
    boolean validateRefreshToken(String refreshToken);

    /**
     * Валидация токена
     * @param token строка с токеном
     * @param secret {@link Key} секретный ключ
     * @return true если валидация пройдена, иначе false
     */
    boolean validateToken(String token, Key secret);

    /**
     * Получение имени и роли пользователя по access-токену
     * @param token строка с токеном
     * @return {@link Claims} пользователя
     */
    Claims getAccessClaims(String token);

    /**
     * Получение имени и роли пользователя по refresh-токену
     * @param token строка с токеном
     * @return {@link Claims} пользователя
     */
    Claims getRefreshClaims(String token);

    /**
     * Получение имени и роли пользователя по токену и ключу
     * @param token строка с токеном
     * @param secret {@link Key} секретный ключ
     * @return {@link Claims} пользователя
     */
    Claims getClaims(String token, Key secret);

}
