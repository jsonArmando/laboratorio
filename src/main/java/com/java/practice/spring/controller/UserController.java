package com.java.practice.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.practice.spring.model.User;
import com.java.practice.spring.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Obtener un usuario por ID
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.findById(id);
    }

    // Crear un nuevo usuario
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.save(user);
    }

    // Actualizar un usuario existente
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        // Verificamos si el usuario existe
        User existingUser = userService.findById(id);
        if (existingUser == null) {
            throw new RuntimeException("Usuario no encontrado con ID: " + id);
        }

        // Actualizamos los campos del usuario existente
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());

        // Guardamos los cambios
        return userService.save(existingUser);
    }

    // Eliminar un usuario por ID
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        // Verificamos si el usuario existe
        User existingUser = userService.findById(id);
        if (existingUser == null) {
            throw new RuntimeException("Usuario no encontrado con ID: " + id);
        }

        // Eliminamos el usuario
        userService.deleteById(id);
        return "Usuario eliminado correctamente con ID: " + id;
    }
}