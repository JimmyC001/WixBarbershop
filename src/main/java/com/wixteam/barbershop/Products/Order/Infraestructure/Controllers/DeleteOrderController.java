package com.wixteam.barbershop.Products.Order.Infraestructure.Controllers;

import com.wixteam.barbershop.Products.Order.Application.Delete.OrderDelete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Orders")
public class DeleteOrderController {
    @Autowired
    private OrderDelete delete;
    @DeleteMapping(value = "/Delete/{OrderId}")
    public ResponseEntity execute(@PathVariable("OrderId") String id) {
        delete.execute(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}
