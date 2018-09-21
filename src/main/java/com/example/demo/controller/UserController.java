package com.example.demo.controller;

import com.example.demo.model.LoginResponse;
import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController()
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity checkLogin(@RequestBody UserModel userModel) {
        LoginResponse loginResponse = userService.checkLogin(userModel);
        return new ResponseEntity<>(loginResponse, HttpStatus.OK);
    }
}