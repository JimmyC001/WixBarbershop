package com.wixteam.barbershop.Services.Date.Domain.Exceptions;

public class CreateDateException extends RuntimeException{
    public CreateDateException(String message) {
        super(message);
    }
}
