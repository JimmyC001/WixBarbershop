package com.wixteam.barbershop.Services.TypeService.Domain.ValueObjects;

import com.wixteam.barbershop.Shared.Domain.Aggregate.CustomUUID;

public class TypeServiceId extends CustomUUID {
    
    public TypeServiceId(String value) {
        super(value);
    }
}
