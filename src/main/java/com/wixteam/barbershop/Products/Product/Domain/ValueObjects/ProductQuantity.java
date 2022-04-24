package com.wixteam.barbershop.Products.Product.Domain.ValueObjects;

import com.wixteam.barbershop.Shared.Domain.Aggregate.IntegerValueObject;

public class ProductQuantity extends IntegerValueObject {
    public ProductQuantity(int value) {
        validate(value);
        this.value=value;
    }
    public void validate(int value){

    }
}
