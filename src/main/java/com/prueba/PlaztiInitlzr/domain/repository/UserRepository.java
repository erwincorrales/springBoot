package com.prueba.PlaztiInitlzr.domain.repository;

import java.util.List;

import com.prueba.PlaztiInitlzr.domain.model.User;

public interface UserRepository {

    List<User> findAll();

    User findByUniqueId(String id);

    User create(User User);

    User update(User User);

    boolean delete(User User);
}
