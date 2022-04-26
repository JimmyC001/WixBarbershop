package com.wixteam.barbershop.Products.Product.Domain.ValueObjects;

import com.wixteam.barbershop.Shared.Domain.Aggregate.DoubleValueObject;

public class ProductPrice extends DoubleValueObject {
    public ProductPrice(double value) {
        validate(value);
        this.value=value;
    }
    public void validate(double value){

    }
    public void notFree(double value){
        if(value<=0){
            throw new RuntimeException("El precio no puede ser igual o menor a 0");
        }
    }
}
