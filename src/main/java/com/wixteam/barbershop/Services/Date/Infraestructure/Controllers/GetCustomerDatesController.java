package com.wixteam.barbershop.Services.Date.Infraestructure.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "Services/Date")
public class GetCustomerDatesController {
    @GetMapping(value = "/Customers/{customerId}")
    public ResponseEntity execute(@PathVariable("customerId") String id) {
        return ResponseEntity.status(HttpStatus.OK).body("Se encontro las citas del cliente con id " + id );
    }
}
