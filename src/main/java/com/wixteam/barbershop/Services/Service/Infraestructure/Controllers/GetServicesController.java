package com.wixteam.barbershop.Services.Service.Infraestructure.Controllers;

import com.wixteam.barbershop.Services.Service.Application.All.AllServices;
import com.wixteam.barbershop.Services.Service.Application.All.ServiceFindAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/Services")
public class GetServicesController {
    @Autowired
    private ServiceFindAll all;
    @GetMapping(value="/All")
    public ResponseEntity<List<HashMap<String,Object>>> execute() {
        AllServices response = new AllServices(all.execute());
        return  ResponseEntity.status(HttpStatus.OK).body(response.response());
    }
}