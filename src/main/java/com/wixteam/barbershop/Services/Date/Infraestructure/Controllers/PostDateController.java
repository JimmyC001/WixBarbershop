package com.wixteam.barbershop.Services.Date.Infraestructure.Controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/com/example/demo/Services")
public class PostDateController {
    @PostMapping(value = "/Date")
    public ResponseEntity<String> execute(@RequestBody DateRequest request ){
        return ResponseEntity.status(HttpStatus.CREATED).body("Se creo la cita " + request.toString());
    }

    static class DateRequest{

        @JsonProperty("customerId")
        private String customerId;
        @JsonProperty("barbersId")
        private String barbersId;
        @JsonProperty("typeService")
        private String typeService;
        @JsonProperty("ServiceId")
        private String ServiceId;
        @JsonProperty("date")
        private String date;

        public DateRequest() {
        }

        @Override
        public String toString() {
            return "DateRequest{" +
                    "customerId='" + customerId + '\'' +
                    ", barbersId='" + barbersId + '\'' +
                    ", typeService='" + typeService + '\'' +
                    ", ServiceId='" + ServiceId + '\'' +
                    ", date='" + date + '\'' +
                    '}';
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
