package com.wixteam.barbershop.Services.Date.Infraestructure.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "Services/Date")
public class GetBarberDatesController {
    @GetMapping(value = "/Barbers/{BarbersId}")
    public ResponseEntity execute(@PathVariable("BarbersId") String id) {
        return ResponseEntity.status(HttpStatus.OK).body("Se encontro las citas del barbero con id " + id );
    }
}
