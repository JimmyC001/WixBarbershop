package com.wixteam.barbershop.Users.Phone.Domain.ValueObjects;

import com.wixteam.barbershop.Shared.Domain.Aggregate.CustomUUID;

public class PhoneId extends CustomUUID {
    public PhoneId(String value) {
        super(value);
    }
}
