package com.wixteam.barbershop.Users.User.Infraestructure.Controllers;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.wixteam.barbershop.Users.User.Application.Update.userUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/Users")
public class PutUserControllers {
    @Autowired
    private userUpdate update;
    @PutMapping(value = "/Update/{UserId}")
    public ResponseEntity execute(@PathVariable("UserId") String id, @RequestBody CustomerRequest request){
        update.execute(id, request.getUsername(), request.getPassword(), request.getPhone());
        return ResponseEntity.status(HttpStatus.CREATED).body("Se modifico el cliente con id "+ id +" con nombre " + request.getUsername());
    }

    static class CustomerRequest{
        @JsonProperty("phone")
        private String phone;
        @JsonProperty("username")
        private String username ;
        @JsonProperty("password")
        private String password;

        @Override
        public String toString() {
            return "CustomerRequest{" +
                    ", phone='" + phone + '\'' +
                    ", username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    '}';
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
