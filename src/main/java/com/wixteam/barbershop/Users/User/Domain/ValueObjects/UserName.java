package com.wixteam.barbershop.Users.User.Domain.ValueObjects;

import com.wixteam.barbershop.Shared.Domain.Aggregate.StringValueObject;

public class UserName extends StringValueObject {


    public UserName(String value) {
        validate(value);
        this.value = value;
    }


    private void validate(String value){

    }
}
