package com.prueba.PlaztiInitlzr.rest.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.PlaztiInitlzr.domain.model.User;
import com.prueba.PlaztiInitlzr.domain.service.UserService;
import com.prueba.PlaztiInitlzr.rest.controller.UserRestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserRestControllerImpl implements UserRestController {
    
    @Autowired
    private final UserService userService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable(name = "id", required = true) String id) {
        return userService.findById(id);
    }

    @PostMapping
    public User creatUser(@RequestBody User user) {
        return userService.create(user);
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public boolean deleteUser(@PathVariable("id") String id) {
        return userService.delete(id);
    }
}
