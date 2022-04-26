package com.wixteam.barbershop.Services.Service.Infraestructure.Controllers;

import com.wixteam.barbershop.Services.Service.Application.Delete.ServiceDelete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Services")
public class DeleteServiceController {
    @Autowired
    private ServiceDelete delete;

    @DeleteMapping(value = "/Delete/{ServiceId}")
    public ResponseEntity execute(@PathVariable("ServiceId") String id) {
        delete.execute(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}
