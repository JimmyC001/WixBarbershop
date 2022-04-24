package com.wixteam.barbershop.Products.Product.Domain.ValueObjects;

import com.wixteam.barbershop.Shared.Domain.Aggregate.StringValueObject;

public class ProductDescription extends StringValueObject {
    public ProductDescription(String value) {
        validate(value);
        this.value = value;
    }
    public void validate(String value){

    }
}
