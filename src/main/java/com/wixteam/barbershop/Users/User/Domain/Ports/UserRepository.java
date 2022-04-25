package com.wixteam.barbershop.Users.User.Domain.Ports;

import com.wixteam.barbershop.Users.User.Domain.User;

import java.util.List;

public interface UserRepository {
    public void save(User user);
    public List<User> all();
    public List<User> allCustomer(String customer);
    public List<User> allBarber(String Barber);
}
