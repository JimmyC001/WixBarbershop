package com.wixteam.barbershop.Services.TypeService.Domain.ValueObjects;

import com.wixteam.barbershop.Shared.Domain.Aggregate.StringValueObject;

public class TypeServiceName extends StringValueObject {
    public TypeServiceName(String value) {
        validate(value);
        this.value = value;
    }
    public void validate(String value){

    }
}
