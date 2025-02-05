package org.example.noteapplication.service;

import org.example.noteapplication.dtos.UserDTO;
import org.example.noteapplication.model.User;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);
}
