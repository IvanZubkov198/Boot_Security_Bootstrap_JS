package ru.kata.spring.boot_security.demo.util;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.entities.Role;
import ru.kata.spring.boot_security.demo.entities.User;
import ru.kata.spring.boot_security.demo.service.RoleServiceImp;
import ru.kata.spring.boot_security.demo.service.UserServiceImp;

import javax.annotation.PostConstruct;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class InitMethod {
    private final RoleServiceImp roleService;
    private final UserServiceImp userServiceImp;

    @PostConstruct
    public void init() {
        Role adminRole = new Role("ADMIN");
        Role userRole = new Role("USER");

        roleService.save(adminRole);
        roleService.save(userRole);

        userServiceImp.save(new User("admin", "admin", "admin@gmail.com", Set.of(adminRole)));
        userServiceImp.save(new User("user", "user", "user@gmail.com", Set.of(userRole)));
    }
}
