package com.wixteam.barbershop.Products.Admin.Infraestructure.Controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Users")
public class PostAdminBarbeshopController {
    @PostMapping(value = "/admin-Barbershops")
    public ResponseEntity<String> execute(@RequestBody AdminRequest request ){
        return ResponseEntity.status(HttpStatus.CREATED).body("Se creo el admin " + request.toString());
    }
    static class AdminRequest{
        @JsonProperty("name")
        private String name ;
        @JsonProperty("password")
        private String password;

        public AdminRequest() {
        }

        @Override
        public String toString() {
            return "AdminRequest{" +
                    "name='" + name + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
