package com.wixteam.barbershop.Users.User.Infraestructure.Controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/Users")
public class DeleteCustomersController {
    @DeleteMapping(value = "/Customer/{customerId}")
    public ResponseEntity execute(@PathVariable("customerId") String id) {
        return ResponseEntity.status(HttpStatus.OK).body("Se Elimino el cliente con id " + id );
    }
}
