package com.wixteam.barbershop.Services.Date.Domain.Port;

import com.wixteam.barbershop.Users.User.Domain.User;

import java.util.List;

public interface DateRepository {
    public void save(User user);
    public List<User> all();
    public List<User> allCustomer(String customer);
    public List<User> allBarber(String Barber);
    public void delete(String idUser);
    public void update(User user, String idUser);
    public boolean Login(String username, String password);
}
