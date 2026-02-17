package com.vcube.users.repo;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.users.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
