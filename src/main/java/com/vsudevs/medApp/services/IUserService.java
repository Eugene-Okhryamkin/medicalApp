package com.vsudevs.medApp.services;

import com.vsudevs.medApp.models.User;

import java.util.List;

public interface IUserService {
    User getByID(Long id);
    void saveUser(User user);
    void deleteUser(Long id);
    List<User> getAll();
}
