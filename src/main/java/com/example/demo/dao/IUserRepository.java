package com.example.demo.dao;

import com.example.demo.model.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IUserRepository extends JpaRepository<users,Integer> {
    @Query("SELECT u FROM users u  WHERE u.email = ?1")
    users findUserByEmail(String name);
}
