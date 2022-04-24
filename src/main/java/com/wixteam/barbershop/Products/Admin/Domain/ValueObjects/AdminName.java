package com.wixteam.barbershop.Products.Admin.Domain.ValueObjects;

import com.wixteam.barbershop.Shared.Domain.Aggregate.StringValueObject;

public class AdminName extends StringValueObject {
    public AdminName(String value) {
        validate(value);
        this.value = value;
    }
    public void validate(String value){

    }
}
