package com.wixteam.barbershop.Products.Product.Domain.ValueObjects;

import com.wixteam.barbershop.Shared.Domain.Aggregate.IntegerValueObject;

public class ProductRating extends IntegerValueObject {
    public ProductRating(int value) {
        validate(value);
        this.value=value;

    }
    public void validate(int value){

    }
}
