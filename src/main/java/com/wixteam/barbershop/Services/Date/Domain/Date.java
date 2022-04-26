package com.wixteam.barbershop.Services.Date.Domain;

import com.wixteam.barbershop.Services.Date.Domain.ValueObjects.DateDate;
import com.wixteam.barbershop.Services.Date.Domain.ValueObjects.DateId;
import com.wixteam.barbershop.Services.Service.Domain.ValueObjects.ServiceId;
import com.wixteam.barbershop.Services.TypeService.Domain.TypeService;
import com.wixteam.barbershop.Services.TypeService.Domain.ValueObjects.TypeServiceId;
import com.wixteam.barbershop.Users.Address.Domain.Address;
import com.wixteam.barbershop.Users.Address.Domain.ValueObjects.AddressId;
import com.wixteam.barbershop.Users.User.Domain.ValueObjects.UserId;

import java.util.HashMap;

public class Date {
    private DateId dateId;
    private UserId userId;
    private UserId barberoid;
    private TypeServiceId typeServiceId;
    private ServiceId serviceId;
    private DateDate dateDate;
    private AddressId addressId;

    public Date(DateId dateId, UserId userId, UserId barberoid, TypeServiceId typeService, ServiceId serviceId, DateDate dateDate,AddressId addressId) {
        this.dateId = dateId;
        this.userId = userId;
        this.barberoid = barberoid;
        this.typeServiceId = typeServiceId;
        this.serviceId = serviceId;
        this.dateDate = dateDate;
        this.addressId = addressId;
    }
    public static Date create(){
        return  null;
    }
    public HashMap<String,Object> data(){
        HashMap<String,Object> data = new HashMap<>(){
            {
                put("id",dateId.value());
                put("userId",userId.value());
                put("barberoId",barberoid.value());
                put("type",typeServiceId.value());
                put("serviceId",serviceId.value());
                put("date",dateDate.value());
            }

        };
        return data;
    }
}
