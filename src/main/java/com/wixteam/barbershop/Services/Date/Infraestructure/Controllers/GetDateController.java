package com.wixteam.barbershop.Services.Date.Infraestructure.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/Services/Date")
public class GetDateController {
    @GetMapping(value = "/{DateId}")
    public ResponseEntity execute(@PathVariable("DateId") String id) {
        return ResponseEntity.status(HttpStatus.OK).body("Se encontro la cita con id " + id );
    }
}
