package com.wixteam.barbershop.Users.User.Infraestructure.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Users")
public class DeleteBarbersController {
    @DeleteMapping(value = "/Barbers/{BarbersId}")
    public ResponseEntity execute(@PathVariable("BarbersId") String id) {
        return ResponseEntity.status(HttpStatus.OK).body("Se Elimino el Barbero con id " + id );
    }
}
