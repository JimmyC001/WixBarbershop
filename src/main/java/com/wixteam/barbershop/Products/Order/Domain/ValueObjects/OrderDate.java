package com.wixteam.barbershop.Products.Order.Domain.ValueObjects;

import com.wixteam.barbershop.Shared.Domain.Aggregate.StringValueObject;

public class OrderDate extends StringValueObject {
    public OrderDate(String value) {
        validate(value);
        this.value = value;
    }
    public void validate(String value){

    }
}
