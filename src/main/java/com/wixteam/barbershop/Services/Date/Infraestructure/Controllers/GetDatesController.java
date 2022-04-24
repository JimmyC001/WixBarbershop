package com.wixteam.barbershop.Services.Date.Infraestructure.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Services")
public class GetDatesController {
    @GetMapping(value = "/Dates")
    public ResponseEntity execute() {
        return ResponseEntity.status(HttpStatus.OK).body("Se regresan todas las citas" );
    }
}
