package com.luv4code.security.spring.api;

import com.luv4code.security.spring.api.domain.Role;
import com.luv4code.security.spring.api.domain.User;
import com.luv4code.security.spring.api.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class SpringBootSecurityWithJwtTokenApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSecurityWithJwtTokenApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.saveRole(new Role("ROLE_USER"));
            userService.saveRole(new Role("ROLE_MANAGER"));
            userService.saveRole(new Role("ROLE_ADMIN"));
            userService.saveRole(new Role("ROLE_SUPER_ADMIN"));

            userService.saveUser(new User("Madhav Ponnana", "madhav", "12345", new ArrayList<>()));
            userService.saveUser(new User("Virat Kohli", "kohli", "12345", new ArrayList<>()));
            userService.saveUser(new User("Rohit Sharma", "rohit", "12345", new ArrayList<>()));
            userService.saveUser(new User("Yuvraj Singh", "yuvraj", "12345", new ArrayList<>()));

            userService.addRoleToUser("madhav", "ROLE_USER");
            userService.addRoleToUser("madhav", "ROLE_MANAGER");
            userService.addRoleToUser("kohli", "ROLE_MANAGER");
            userService.addRoleToUser("rohit", "ROLE_ADMIN");
            userService.addRoleToUser("yuvraj", "ROLE_ADMIN");
            userService.addRoleToUser("yuvraj", "ROLE_USER");
            userService.addRoleToUser("yuvraj", "ROLE_SUPER_ADMIN");

        };
    }
}
