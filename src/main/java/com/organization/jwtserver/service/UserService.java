package com.organization.jwtserver.service;

import com.organization.jwtserver.domain.User;
import com.organization.jwtserver.exception.AuthException;

import java.util.Optional;

public interface UserService {

    /**
     * Получение пользователя по логину
     * @param login строка с логином
     * @return {@link User} обернутый в {@link Optional}
     * @throws AuthException если пользователь не найден или пароль неверный
     */
    Optional<User> getUserByLogin(String login);

}
