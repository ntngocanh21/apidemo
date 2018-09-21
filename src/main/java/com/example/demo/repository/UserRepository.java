package com.example.demo.repository;

import com.example.demo.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, String> {
    UserEntity findUserEntityByUsernameAndPassword(String username, String password);
    UserEntity findUserEntityByUsername(String username);
}

