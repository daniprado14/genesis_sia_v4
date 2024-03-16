package com.prueba1.prueba1.services;

import com.prueba1.prueba1.models.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id);
    List<User> getAllUser();
    User editUser(Long id, User user);
    Boolean deleteUser(Long id);
}
