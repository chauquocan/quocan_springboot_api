package com.quocan.quocan_springboot_api.service;

import com.quocan.quocan_springboot_api.entity.User;
import com.quocan.quocan_springboot_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;


    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return repository.findAll();
    }

    @Override
    public User getUserById(Long userId) {
        return repository.findById(userId).get();
    }

    @Override
    public void deleteById(Long userId) {
        repository.deleteById(userId);
    }

    @Override
    public void updateUserById(User user) {
        repository.save(user);
    }


}
