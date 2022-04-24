package com.wixteam.barbershop.Products.Product.Infraestructure.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Products")
public class GetProductsController {
    @GetMapping()
    public ResponseEntity<String> execute() {
        return  ResponseEntity.status(HttpStatus.OK).body("Regresa todos los productos");
    }
}
