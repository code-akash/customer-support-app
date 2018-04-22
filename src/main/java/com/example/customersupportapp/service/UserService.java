package com.example.customersupportapp.service;

import com.example.customersupportapp.dto.AddUserDto;
import com.example.customersupportapp.dto.LoginUserDto;

public interface UserService {
    String signup(AddUserDto user);
    String signin(LoginUserDto loginUserDto);
}
