package com.wixteam.barbershop.Users.User.Application.Login;

import com.wixteam.barbershop.Users.User.Domain.Ports.UserRepository;

public class loginUser {
    private UserRepository repository;

    public loginUser(UserRepository repository) {
        this.repository = repository;
    }

    public boolean execute(String username, String password){
        return  repository.Login(username,password);
    }
}
