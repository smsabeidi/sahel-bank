package com.sahelbank.Sahel_Bank.repository;

import com.sahelbank.Sahel_Bank.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // This interface provides methods for talking to my database

    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);

}
