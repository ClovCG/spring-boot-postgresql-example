package com.example.demoAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoAPI.api.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
