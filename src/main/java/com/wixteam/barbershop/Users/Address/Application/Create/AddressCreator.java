package com.wixteam.barbershop.Users.Address.Application.Create;

import com.wixteam.barbershop.Users.Address.Domain.Address;
import com.wixteam.barbershop.Users.Address.Domain.ValueObjects.*;
import com.wixteam.barbershop.Users.Address.Domain.Ports.AddressRepository;
import com.wixteam.barbershop.Users.User.Domain.ValueObjects.UserId;

public class AddressCreator {
    private AddressRepository repository;
    public AddressCreator(AddressRepository repository){this.repository = repository;}

    public void execute(String id, String detail, String city, String additionalInfo , String neighborhood , String userId){
        Address address = new Address(new AddressId(id) , new AddressDetail(detail) , new AddressCity(city) , new AddressAdditionalInfo(additionalInfo), new AddressNeighborhood(neighborhood), new UserId(userId));
        repository.save(address);
    }
}
