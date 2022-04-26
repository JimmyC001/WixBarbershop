package com.wixteam.barbershop.Products.Product.Domain.ValueObjects;

import com.wixteam.barbershop.Shared.Domain.Aggregate.DoubleValueObject;

public class ProductPrice extends DoubleValueObject {
    public ProductPrice(){}
    public ProductPrice(double value) {
        validate(value);
        this.value=value;
    }
    public void validate(double value){

    }
}
