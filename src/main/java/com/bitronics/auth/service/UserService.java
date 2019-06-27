package com.bitronics.auth.service;

import com.bitronics.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
