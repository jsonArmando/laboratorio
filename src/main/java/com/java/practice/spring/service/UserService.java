package com.java.practice.spring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.practice.spring.model.User;
import com.java.practice.spring.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Obtener un usuario por ID
    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null); // Devuelve null si no se encuentra el usuario
    }

    // Crear o actualizar un usuario
    public User save(User user) {
        return userRepository.save(user);
    }

    // Eliminar un usuario por ID
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}