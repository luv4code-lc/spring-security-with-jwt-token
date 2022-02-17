package com.luv4code.security.spring.api.repository;

import com.luv4code.security.spring.api.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
