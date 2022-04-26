package com.wixteam.barbershop.Admin.Infraestructure.Controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wixteam.barbershop.Admin.Application.Create.AdminCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Admin")
public class PostAdminBarbeshopController {

    @Autowired
    private AdminCreator create;

    @PostMapping(value = "/Create")
    public ResponseEntity<String> execute(@RequestBody AdminRequest request ){
        create.execute(request.getId(),request.getName(),request.getPassword());
        return ResponseEntity.status(HttpStatus.CREATED).body("Se creo el admin " + request.toString());
    }
    static class AdminRequest{
        @JsonProperty("id")
        private String id;
        @JsonProperty("name")
        private String name;
        @JsonProperty("password")
        private String password;
        public AdminRequest() {}

        @Override
        public String toString() {
            return "AdminRequest{" +
                    "id" + id + "\'" +
                    "name='" + name + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }

        public String getId(){ return id; }

        public void setId(String id){ this.id = id; }

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
