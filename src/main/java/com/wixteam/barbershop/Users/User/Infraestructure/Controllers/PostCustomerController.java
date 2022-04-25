package com.wixteam.barbershop.Users.User.Infraestructure.Controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wixteam.barbershop.Users.User.Application.Create.UserCustomerCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping(value = "/Users")
public class PostCustomerController {
    @Autowired
    private UserCustomerCreator creator;
    @PostMapping(value = "/Customer")
    public ResponseEntity<String> execute (@RequestBody CustomerRequest request ){
        creator.execute( request.getUserId(), request.getUsername(), request.getPassword(), request.getPhone());
        return ResponseEntity.status(HttpStatus.CREATED).body(" persona nombre " + request.toString() );
    }
    static class CustomerRequest{
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
