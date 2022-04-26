package com.wixteam.barbershop.Users.User.Infraestructure.Controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wixteam.barbershop.Users.User.Application.Create.UserBarberCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Users")

public class PostBarbersController {
    @Autowired
    private UserBarberCreator create;

    @PostMapping(value = "/Barber/Create/")
    public ResponseEntity<String> execute3(@RequestBody BarbarRequest request ){
        create.execute( request.getUserId(), request.getUsername(), request.getPassword(), request.getPhone());
        return ResponseEntity.status(HttpStatus.CREATED).body("Se creo el Barbero" + request.toString());
    }
    static class BarbarRequest {
        @JsonProperty("userId")
        private String userId ;
        @JsonProperty("phone")
        private String phone;
        @JsonProperty("username")
        private String username ;
        @JsonProperty("password")
        private String password;

        @Override
        public String toString() {
            return "CustomerRequest{" +
                    "userId='" + userId + '\'' +
                    ", phone='" + phone + '\'' +
                    ", username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
