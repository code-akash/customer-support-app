package com.example.customersupportapp.dao;

import com.example.customersupportapp.dto.AddUserDto;
import com.example.customersupportapp.dto.LoginUserDto;

public interface UserDao {
    String addUser(AddUserDto user);
    String loginUser(LoginUserDto loginUserDto);
}
