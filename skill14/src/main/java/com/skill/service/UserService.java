package com.skill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.skill.model.User;
import com.skill.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public User register(User user) {
        return repo.save(user);
    }

    public User login(String username, String password) {

        System.out.println("USERNAME: " + username);

        User user = repo.findByUsername(username);

        System.out.println("DB USER: " + user);

        if (user == null) return null;

        if (user.getPassword().equals(password)) {
            return user;
        }

        return null;
    }

    public User getById(Long id) {
        return repo.findById(id).orElse(null);
    }
}