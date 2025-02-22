package com.java.practice.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.practice.spring.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}