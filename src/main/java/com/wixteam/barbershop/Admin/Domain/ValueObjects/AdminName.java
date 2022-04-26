package com.wixteam.barbershop.Admin.Domain.ValueObjects;

import com.wixteam.barbershop.Shared.Domain.Aggregate.StringValueObject;

public class AdminName extends StringValueObject {
    public AdminName(String value) {
        validate(value);
        this.value = value;
    }
    public AdminName(){}
    public void validate(String value){
        lengthValue(value);
        notAllowedCharacter(value);
    }
    public void lengthValue(String value){
        if(value.length()<2 || value.length()>20){
            throw new RuntimeException(" Longitud invalida ");
        }
    }
    private void notAllowedCharacter(String value){
       if(value.contains("$") ||value.contains("%")||value.contains("&")||
               value.contains("!")||value.contains("?")||value.contains("¡")||
               value.contains("¿")||value.contains("*")){
           throw new RuntimeException(" Caracteres no validos ");
        }
    }
}
