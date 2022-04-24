package com.wixteam.barbershop.Services.Service.Infraestructure.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Services")
public class GetServicesController {
    @GetMapping()
    public ResponseEntity<String> execute() {
        return  ResponseEntity.status(HttpStatus.OK).body("Regresa los Servicios");
    }
}
