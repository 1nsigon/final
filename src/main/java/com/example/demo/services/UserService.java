package com.example.demo.services;
import com.example.demo.models.Role;
import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService
{

    List<User> getAllUsers();


    List<Role> getAllRoles();
}
