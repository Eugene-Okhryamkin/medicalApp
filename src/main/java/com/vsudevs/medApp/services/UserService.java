package com.vsudevs.medApp.services;

import com.vsudevs.medApp.models.User;
import com.vsudevs.medApp.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    IUserRepository userRepository;

    public User getByID(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    };


    public List<User> getAll() {
        return userRepository.findAll();
    }
}
