package com.bitronics.auth.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitronics.auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
