package com.wixteam.barbershop.Users.User.Infraestructure.Controllers;

import com.wixteam.barbershop.Users.User.Application.Delete.UserDelete;
import com.wixteam.barbershop.Users.User.Domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Users")
public class DeleteUserController {
    @Autowired
    private UserDelete delete;

    @DeleteMapping(value = "/Delete/{UserId}")
    public ResponseEntity execute(@PathVariable("UserId") String id) {
        delete.execute(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}
