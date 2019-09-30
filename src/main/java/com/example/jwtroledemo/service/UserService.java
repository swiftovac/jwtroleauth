package com.example.jwtroledemo.service;

import com.example.jwtroledemo.model.User;
import com.example.jwtroledemo.model.UserDto;

import java.util.List;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);
    User findById(Long id);
}
