package com.wixteam.barbershop.Users.User.Infraestructure.Controllers;

import com.wixteam.barbershop.Users.User.Application.All.AllCustomers;
import com.wixteam.barbershop.Users.User.Application.All.UserFindAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/Users")
public class GetCustomersController {
    @Autowired
    private UserFindAll all;
    @GetMapping(value = "/Customers/All")
    public ResponseEntity<List<HashMap<String,Object>>> execute() {
        AllCustomers response = new AllCustomers(all.execute());
        return  ResponseEntity.status(HttpStatus.OK).body(response.response());
    }
}
