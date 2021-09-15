package com.quocan.quocan_springboot_api.service;

import com.quocan.quocan_springboot_api.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUser();
    public User getUserById(Long userId);
    public void deleteById(Long userId);
    public void updateUserById(User user);
}
