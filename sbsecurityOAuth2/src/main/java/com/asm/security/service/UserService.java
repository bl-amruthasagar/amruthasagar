package com.asm.security.service;

import java.util.List;

import com.asm.security.model.User;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}