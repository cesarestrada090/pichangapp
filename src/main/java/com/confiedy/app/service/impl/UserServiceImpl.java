package com.confiedy.app.service.impl;

import com.confiedy.app.advice.exceptions.ResourceNotFoundException;
import com.confiedy.app.entities.User;
import com.confiedy.app.repository.UserRepository;
import com.confiedy.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Integer userId) {
        return userRepository.findById(userId);
    }

    public User createUser(User user) {
        // Aquí puedes agregar lógica adicional antes de guardar el usuario, si es necesario
        return userRepository.save(user);
    }

    public User updateUser(Integer userId, User newUserDetails) {
        return userRepository.findById(userId).map(user -> {
            user.setUsername(newUserDetails.getUsername());
            user.setEmail(newUserDetails.getEmail());
            // Actualiza otros campos según sea necesario
            return userRepository.save(user);
        }).orElseThrow(() -> new ResourceNotFoundException("User not found with id " + userId));
    }

    public void deleteUser(Integer userId) {
        userRepository.deleteById(userId);
    }
}