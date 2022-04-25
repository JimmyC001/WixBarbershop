package com.wixteam.barbershop.Users.User.Domain.ValueObjects;

import com.wixteam.barbershop.Shared.Domain.Aggregate.StringValueObject;

import java.util.HashMap;

public class Phone extends StringValueObject {
    public Phone() {
    }

    public Phone(String value) {
        validate(value);
        this.value = value;
    }
    private void validate(String value){

    }
}
