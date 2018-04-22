package com.example.customersupportapp.service;

import com.example.customersupportapp.dao.UserDao;
import com.example.customersupportapp.dto.AddUserDto;
import com.example.customersupportapp.dto.LoginUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public String signup(AddUserDto userDto) {
        return userDao.addUser(userDto);
    }

    @Override
    public String signin(LoginUserDto loginUserDto) { return userDao.loginUser(loginUserDto); }
}
