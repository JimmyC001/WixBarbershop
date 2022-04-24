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
public class PostBarbersController {
    @PostMapping(value = "/Barber")
    public ResponseEntity<String> execute3(@RequestBody BarbarRequest request ){
        return ResponseEntity.status(HttpStatus.CREATED).body("Se creo el Barbero" + request.toString());
    }
    static class BarbarRequest {
        @JsonProperty("name")
        private String name ;
        @JsonProperty("phone")
        private String phone;
        @JsonProperty("type")
        private String type ;
        @JsonProperty("password")
        private String password;

        @Override
        public String toString() {
            return "CustomerRequest{" +
                    "name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    ", type='" + type + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }

        public BarbarRequest() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    }
}
