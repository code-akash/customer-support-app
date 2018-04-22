package com.example.customersupportapp.controller;

import com.example.customersupportapp.dto.AddUserDto;
import com.example.customersupportapp.dto.LoginUserDto;
import com.example.customersupportapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/signup", method = RequestMethod.POST, consumes = "application/json")
    public String signUp(@RequestBody @Valid AddUserDto addUserDto){
        return userService.signup(addUserDto);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST, consumes = "application/json")
    public String signIn(@RequestBody @Valid LoginUserDto loginUserDto){
        return userService.signin(loginUserDto);
    }
}