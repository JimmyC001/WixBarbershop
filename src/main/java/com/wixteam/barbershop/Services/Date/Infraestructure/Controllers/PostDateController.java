package com.wixteam.barbershop.Services.Date.Infraestructure.Controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wixteam.barbershop.Services.Date.Application.Create.dateCreate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Services")
public class PostDateController {
    @Autowired
    private dateCreate create;
    @PostMapping(value = "/Date/Create")
    public ResponseEntity execute(@RequestBody DateRequest request ){
        create.execute(request.getIdDate(),request.getCustomerId(),request.getBarbersId(),request.getTypeService(),request.getServiceId(),request.getDate(), request.getAddId());
        return ResponseEntity.status(HttpStatus.CREATED).body("Se creo la cita " + request.toString());
    }

    static class DateRequest{
        @JsonProperty("Iddate")
        private String IdDate;
        @JsonProperty("customerId")
        private String customerId;
        @JsonProperty("barbersId")
        private String barbersId;
        @JsonProperty("typeService")
        private String typeService;
        @JsonProperty("ServiceId")
        private String ServiceId;
        @JsonProperty("addId")
        private String addId;
        @JsonProperty("date")
        private String date;

        public String getAddId() {
            return addId;
        }

        public void setAddId(String addId) {
            this.addId = addId;
        }

        public DateRequest() {
        }

        @Override
        public String toString() {
            return "DateRequest{" +
                    "IdDate='" + IdDate + '\'' +
                    ", customerId='" + customerId + '\'' +
                    ", barbersId='" + barbersId + '\'' +
                    ", typeService='" + typeService + '\'' +
                    ", ServiceId='" + ServiceId + '\'' +
                    ", addId='" + addId + '\'' +
                    ", date='" + date + '\'' +
                    '}';
        }

        public String getIdDate() {
            return IdDate;
        }

        public void setIdDate(String idDate) {
            IdDate = idDate;
        }

        public String getCustomerId() {
            return customerId;
        }

        public void setCustomerId(String customerId) {
            this.customerId = customerId;
        }

        public String getBarbersId() {
            return barbersId;
        }

        public void setBarbersId(String barbersId) {
            this.barbersId = barbersId;
        }

        public String getTypeService() {
            return typeService;
        }

        public void setTypeService(String typeService) {
            this.typeService = typeService;
        }

        public String getServiceId() {
            return ServiceId;
        }

        public void setServiceId(String serviceId) {
            ServiceId = serviceId;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }
}
