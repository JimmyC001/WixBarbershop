package com.wixteam.barbershop.Admin.Domain.ValueObjects;

import com.wixteam.barbershop.Shared.Domain.Aggregate.StringValueObject;

public class AdminPassword extends StringValueObject {
    public AdminPassword(String value) {
        validate(value);
        this.value=value;
    }
    public void validate(String value){

    }
}
