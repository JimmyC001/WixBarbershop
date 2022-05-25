package com.wixteam.barbershop.Products.Product.Domain.ValueObjects;

import com.wixteam.barbershop.Shared.Domain.Aggregate.StringValueObject;

public class ProductDescription extends StringValueObject {
    public ProductDescription(){}
    public ProductDescription(String value) {
        validate(value);
        this.value = value;
    }
    public void validate(String value){
        lengthValue(value);
    }
    public void lengthValue(String value){
        if(value.length()<1 || value.length()>2000){
            throw new RuntimeException(" Longitud invalida ");
        }
    }
}
