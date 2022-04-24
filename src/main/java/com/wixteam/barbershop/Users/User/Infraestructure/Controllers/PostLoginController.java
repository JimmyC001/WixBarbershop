package com.wixteam.barbershop.Users.User.Infraestructure.Controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Users")
public class PostLoginController {
    @PostMapping(value = "/Login")
    public ResponseEntity<String> execute(@RequestBody LoginRequest request ){
        return ResponseEntity.status(HttpStatus.CREATED).body("Se realizo el login " + request.toString());
    }
    static class LoginRequest{
        @JsonProperty("Nombre")
        private String Nombre ;
        @JsonProperty("Pasword")
        private String Pasword;

        @Override
        public String toString() {
            return "LoginRequest{" +
                    "Nombre='" + Nombre + '\'' +
                    ", Pasword='" + Pasword + '\'' +
                    '}';
        }

        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String nombre) {
            Nombre = nombre;
        }

        public String getPasword() {
            return Pasword;
        }

        public void setPasword(String pasword) {
            Pasword = pasword;
        }
    }
}
