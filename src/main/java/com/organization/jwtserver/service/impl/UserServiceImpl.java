package com.organization.jwtserver.service.impl;

import com.organization.jwtserver.domain.User;
import com.organization.jwtserver.repository.UserRepository;
import com.organization.jwtserver.service.UserService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Optional<User> getUserByLogin(@NonNull String login) {
        return userRepository.findByLogin(login);
    }

}
