package com.wixteam.barbershop.Services.Service.Infraestructure.Controllers;

import com.wixteam.barbershop.Services.Service.Application.All.AllServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Services")
public class GetServicesController {
    //@Autowired
    //private AllServices all;
    @GetMapping()
    public ResponseEntity<String> execute() {
        return  ResponseEntity.status(HttpStatus.OK).body("Regresa los Servicios");
    }
}
