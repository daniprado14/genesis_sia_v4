package com.prueba1.prueba1.services;

import com.prueba1.prueba1.models.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Override
    public User createUser(User user) {
        return User.builder()
                .fullName("dani")
                .id(1L)
                .birthDay(LocalDate.parse("2022-02-22"))
                .email("dani@gmail.com")
                .build();
    }

    private void build() {
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public User editUser(Long id, User user) {
        return null;
    }

    @Override
    public Boolean deleteUser(Long id) {
        return null;
    }
}
