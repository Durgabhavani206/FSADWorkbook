package com.skill.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skill.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}