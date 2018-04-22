package com.example.customersupportapp.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class LoginUserDto {
    @NotNull(message = "Email cannot be null.")
    @Email()
    private String email;
    @NotNull(message = "password cannot be null.")
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginUserDto{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
