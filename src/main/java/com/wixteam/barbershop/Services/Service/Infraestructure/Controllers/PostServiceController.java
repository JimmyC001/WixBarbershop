package com.wixteam.barbershop.Services.Service.Infraestructure.Controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wixteam.barbershop.Services.Service.Application.Create.ServiceCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Services")
public class PostServiceController {
    @Autowired
    private ServiceCreator create;

    @PostMapping(value = "/Service/Create")
    public ResponseEntity<String> execute3(@RequestBody ServiceRequest request ){
        create.execute( request.getServiceId(), request.getServicePrice(), request.getServiceDetails());
        return ResponseEntity.status(HttpStatus.CREATED).body("Se creo el servicio " + request.toString());
    }
    static class ServiceRequest {
        @JsonProperty("serviceId")
        private String serviceId ;
        @JsonProperty("servicePrice")
        private double servicePrice;
        @JsonProperty("serviceDetails")
        private String serviceDetails ;

        @Override
        public String toString() {
            return "ServiceRequest{" +
                    "serviceId='" + serviceId + '\'' +
                    ", servicePrice='" + servicePrice + '\'' +
                    ", serviceDetails='" + serviceDetails + '\'' +
                    '}';
        }

        public String getServiceId() {
            return serviceId;
        }

        public void setServiceId(String serviceId) {
            this.serviceId = serviceId;
        }

        public double getServicePrice() {
            return servicePrice;
        }

        public void setServicePrice(double servicePrice) {
            this.servicePrice = servicePrice;
        }

        public String getServiceDetails() {
            return serviceDetails;
        }

        public void setServiceDetails(String serviceDetails) {
            this.serviceDetails = serviceDetails;
        }
    }
}
