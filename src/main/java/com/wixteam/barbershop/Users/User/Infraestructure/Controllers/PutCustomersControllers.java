package com.wixteam.barbershop.Users.User.Infraestructure.Controllers;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/Users")
public class PutCustomersControllers {
    @PutMapping(value = "/Customers/{customerId}")
    public ResponseEntity execute(@PathVariable("customerId") String id, @RequestBody Request request){
        return ResponseEntity.status(HttpStatus.CREATED).body("Se modifico el cliente con id "+ id +" con nombre " + request.getNombre());
    }

    static class Request{
        @JsonProperty("Nombre")
        private String Nombre ;
        @JsonProperty("Apellido")
        private String Apellido;

        public Request() {
        }

        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String nombre) {
            Nombre = nombre;
        }

        public String getApellido() {
            return Apellido;
        }

        public void setApellido(String apellido) {
            Apellido = apellido;
        }
    }
}
