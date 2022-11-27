package com.prueba.PlaztiInitlzr.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.PlaztiInitlzr.domain.model.User;
import com.prueba.PlaztiInitlzr.domain.repository.UserRepository;
import com.prueba.PlaztiInitlzr.domain.service.UserService;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;

    public User findById(String id) {
        return userRepository.findByUniqueId(id);
    }

    public List<User> getUsers() {
        return this.getUserRepository().findAll();
    }

    public User create(User user) {
        return this.getUserRepository().create(user);
    }

    public User update(User user) {
        return this.getUserRepository().update(user);
    }

    public boolean delete(String userId) {
        User user = this.getUserRepository().findByUniqueId(userId);
        if (user != null) {
            this.getUserRepository().delete(user);
            return true;
        } else {
            return false;
        }
    }
}
