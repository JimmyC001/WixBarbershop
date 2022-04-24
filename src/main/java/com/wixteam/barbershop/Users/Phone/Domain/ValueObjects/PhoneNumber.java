package com.wixteam.barbershop.Users.Phone.Domain.ValueObjects;

import com.wixteam.barbershop.Shared.Domain.Aggregate.IntegerValueObject;

public class PhoneNumber extends IntegerValueObject {
    public PhoneNumber(int value) {
        validate(value);
        this.value =value;
    }
    public void validate(int value){

    }
}
