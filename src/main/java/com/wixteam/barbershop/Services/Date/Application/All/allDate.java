package com.wixteam.barbershop.Services.Date.Application.All;

import com.wixteam.barbershop.Services.Date.Domain.Port.DateRepository;

public class allDate {
    private DateRepository repository;

    public allDate(DateRepository repository) {
        this.repository = repository;
    }
    public void execute(){}
}
