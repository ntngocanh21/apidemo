package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import com.example.demo.model.LoginResponse;
import com.example.demo.model.MessageResponse;
import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public LoginResponse checkLogin(UserModel userLoginModel) {
        UserEntity userEntity = userRepository.findUserEntityByUsernameAndPassword(userLoginModel.getUsername(), userLoginModel.getPassword());
        MessageResponse messageResponse = new MessageResponse();
        if (userEntity == null) {
            messageResponse.setCode(302);
            messageResponse.setDescription("failure");
            LoginResponse loginResponse = new LoginResponse(messageResponse,null);
            return loginResponse;
        }
        else{
            messageResponse.setCode(0);
            messageResponse.setDescription("Success");
            LoginResponse loginResponse = new LoginResponse(messageResponse,null);
            return loginResponse;
        }
    }
}