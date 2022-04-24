package com.wixteam.barbershop.Users.User.Domain;

import com.wixteam.barbershop.Products.Order.Domain.Order;
import com.wixteam.barbershop.Users.Phone.Domain.Phone;
import com.wixteam.barbershop.Users.User.Domain.ValueObjects.UserPassword;
import com.wixteam.barbershop.Users.User.Domain.ValueObjects.UserType;
import com.wixteam.barbershop.Users.User.Domain.ValueObjects.UserId;
import com.wixteam.barbershop.Users.User.Domain.ValueObjects.UserName;

import java.util.ArrayList;
import java.util.HashMap;

public class User {
    private UserId userid;
    private UserName username;
    private UserPassword userPassword;
    private UserType usertype;
    private Phone phone;
    private ArrayList<Order> orders;

    public User(UserId userid, UserName username, UserPassword userPassword, UserType usertype, Phone phone, ArrayList<Order> orders) {
        this.userid = userid;
        this.username = username;
        this.userPassword = userPassword;
        this.usertype = usertype;
        this.phone = phone;
        this.orders = orders;
    }
    public static User create(){
        return null;
    }
    public HashMap<String,Object> data(){
        HashMap<String,Object> data = new HashMap<>(){
            {
                put("id",userid.value());
                put("name",username.value());
                put("phone",phone);
                put("type",usertype.value());

;            }

        };
        return  data;
    }
}
