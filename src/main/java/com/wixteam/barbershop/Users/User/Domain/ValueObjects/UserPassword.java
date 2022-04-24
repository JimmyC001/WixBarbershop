package com.wixteam.barbershop.Users.User.Domain.ValueObjects;

import com.wixteam.barbershop.Shared.Domain.Aggregate.StringValueObject;

public class UserPassword extends StringValueObject {


    public UserPassword(String value) {
        validate(value);
        this.value = value;
    }


    private void validate(String value){

    }
}
