package com.wixteam.barbershop.Users.User.Application.All;

import com.wixteam.barbershop.Users.User.Domain.Ports.UserRepository;
import com.wixteam.barbershop.Users.User.Domain.User;
import com.wixteam.barbershop.Users.User.Domain.ValueObjects.*;

import java.util.List;

public class AllCustomers {

    private UserRepository repository;

    public AllCustomers(UserRepository repository) {
        this.repository = repository;
    }
    public List<User> execute(){
        return  repository.allCustomer("Custormer");
    }
}
