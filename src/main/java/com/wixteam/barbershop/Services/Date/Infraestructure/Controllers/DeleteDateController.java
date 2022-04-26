package com.wixteam.barbershop.Services.Date.Infraestructure.Controllers;

import com.wixteam.barbershop.Services.Date.Application.Delete.DateDelete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "Services/Date")
public class DeleteDateController {
    @Autowired
    private DateDelete delete;
    @DeleteMapping(value = "Delete/{DateId}")
    public ResponseEntity execute(@PathVariable("DateId") String id) {
        delete.execute(id);
        return ResponseEntity.status(HttpStatus.OK).body("Se elimino la cita con id " + id );
    }
}
