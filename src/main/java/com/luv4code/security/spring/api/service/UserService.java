package com.luv4code.security.spring.api.service;

import com.luv4code.security.spring.api.domain.Role;
import com.luv4code.security.spring.api.domain.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();
}
