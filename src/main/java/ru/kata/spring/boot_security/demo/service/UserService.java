package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.entities.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User getById(Long id);

    User findUserByUsername(String username);

    void save(User user);

    void deleteById(Long id);

    void update(Long id, User user);

    User getCurrentUser();
}
