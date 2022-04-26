package com.wixteam.barbershop.Products.Admin.Domain.ValueObjects;

import com.wixteam.barbershop.Shared.Domain.Aggregate.StringValueObject;

public class AdminPassword extends StringValueObject {
    public AdminPassword(String value) {
        validate(value);
        this.value=value;
    }
    public void validate(String value){
        lengthValue(value);
        numbers(value);
    }

    public void lengthValue(String value){
        if(value.length()<8 ){
            throw new RuntimeException(" Longitud invalida ");
        }
    }
    public void numbers(String value){
        if(!value.contains("0")||!value.contains("1")||!value.contains("2")||!value.contains("3")||
                !value.contains("4")||!value.contains("5")||!value.contains("6")||!value.contains("7")||
                !value.contains("8")||!value.contains("9")){
            throw new RuntimeException("la contraseña requiere minimo un numero");
        }
    }
    public void characters(String value){
        if(!value.contains("#")||!value.contains("$")||!value.contains("%")||!value.contains("&")||
                !value.contains("!")||!value.contains("*")||!value.contains("+")||!value.contains("@")||
                !value.contains("¡")||!value.contains("¿")){
            throw new RuntimeException("la contraseña requiere minimo un caracter espacial");
        }
    }

}
