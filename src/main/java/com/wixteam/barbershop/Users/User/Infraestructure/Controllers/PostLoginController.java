package com.wixteam.barbershop.Users.User.Infraestructure.Controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wixteam.barbershop.Users.User.Application.Login.loginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Users")
public class PostLoginController {
    @Autowired
    private loginUser log;
    @PostMapping(value = "/Login")
    public ResponseEntity<Boolean> execute(@RequestBody LoginRequest request ){
        boolean response = log.execute(request.getName(), request.getPasword());
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    static class LoginRequest{
        @JsonProperty("name")
        private String name;
        @JsonProperty("Pasword")
        private String Pasword;

        @Override
        public String toString() {
            return "LoginRequest{" +
                    "Nombre='" + name + '\'' +
                    ", Pasword='" + Pasword + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPasword() {
            return Pasword;
        }

        public void setPasword(String pasword) {
            Pasword = pasword;
        }
    }
}
