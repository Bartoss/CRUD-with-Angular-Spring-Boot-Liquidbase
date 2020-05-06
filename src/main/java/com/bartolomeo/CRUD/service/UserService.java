package com.bartolomeo.CRUD.service;

import com.bartolomeo.CRUD.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    User findByUsername(String username);

    List<User> findAllUsers();

    User updateUser(User user);

}
