package com.organization.jwtserver.service;

import com.organization.jwtserver.domain.User;

import java.util.Optional;

public interface UserService {

    Optional<User> getUserByLogin(String login);

}
