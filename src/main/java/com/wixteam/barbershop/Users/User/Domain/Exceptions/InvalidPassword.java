package com.wixteam.barbershop.Users.User.Domain.Exceptions;

public class InvalidPassword extends RuntimeException{
    public InvalidPassword(String message) {
        super(message);
    }
}
