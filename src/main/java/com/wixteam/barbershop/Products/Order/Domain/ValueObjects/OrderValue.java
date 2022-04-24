package com.wixteam.barbershop.Products.Order.Domain.ValueObjects;

import com.wixteam.barbershop.Shared.Domain.Aggregate.DoubleValueObject;

public class OrderValue extends DoubleValueObject {
    public OrderValue(double value) {
        validate(value);
        this.value = value;
    }
    public void validate(double value){

    }
}
