package com.wixteam.barbershop.Services.Date.Application.Create;

import com.wixteam.barbershop.Services.Date.Domain.Port.DateRepository;

public class dateCreate {
    private DateRepository repository;

    public dateCreate(DateRepository repository) {
        this.repository = repository;
    }
    public void execute(){}
}
