package com.prueba.PlaztiInitlzr.domain.service;

import java.util.List;

import com.prueba.PlaztiInitlzr.domain.model.User;

public interface UserService {
    List<User> getUsers();

    User findById(String userId);

    User create(User user);

    User update(User user);

    boolean delete(String userId);
}
