package ru.kata.spring.boot_security.demo.configs.security;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import ru.kata.spring.boot_security.demo.entities.Role;

@Getter
public class GrantedAuthorityImp implements GrantedAuthority {

    private final Role role;

    public GrantedAuthorityImp(Role role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role.getRole();
    }

}
