package com.example.customersupportapp.dao;

import com.example.customersupportapp.dto.AddUserDto;
import com.example.customersupportapp.dto.LoginUserDto;
import com.example.customersupportapp.entity.User;
import com.example.customersupportapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private UserRepository userRepository;

    @Override
    public String addUser(AddUserDto userDto) {
        userRepository.save(getEntityFromDto(userDto));
        return "success";
    }

    @Override
    public String loginUser(LoginUserDto loginUserDto) {
        User user = userRepository.findByEmail(loginUserDto.getEmail());
        System.out.println(user.getEmail());
        if(user != null && user.getPassword().equals(loginUserDto.getPassword())){
            return "success";
        }
        return "Invalid username/password.";
    }

    private User getEntityFromDto(AddUserDto userDto){
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setFirst_name(userDto.getFirst_name());
        user.setLast_name(userDto.getLast_name());
        user.setPassword(userDto.getPassword());
        user.setPhone_number(userDto.getPhone_number());
        user.setAddress(userDto.getAddress());
        return user;
    }
}
