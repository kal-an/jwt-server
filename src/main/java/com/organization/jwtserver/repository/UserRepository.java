package com.organization.jwtserver.repository;

import com.organization.jwtserver.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
