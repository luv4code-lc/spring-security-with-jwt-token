package com.luv4code.security.spring.api.repository;

import com.luv4code.security.spring.api.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
