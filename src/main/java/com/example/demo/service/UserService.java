package com.example.demo.service;

import com.example.demo.model.LoginResponse;
import com.example.demo.model.MessageResponse;
import com.example.demo.model.UserModel;

public interface UserService {
    LoginResponse checkLogin(UserModel userModel);
    MessageResponse register(UserModel userModel);
}
