package com.wixteam.barbershop.Services.Service.Infraestructure.Controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wixteam.barbershop.Services.Service.Application.Update.ServiceUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/Services")
public class PutServiceController {
    @Autowired
    private ServiceUpdate update;
    @PutMapping(value = "/Update/{ServiceId}")
    public ResponseEntity execute(@PathVariable("ServiceId") String id, @RequestBody ServiceRequest request){
        update.execute(id, request.getServicePrice(), request.getServiceDetails());
        return ResponseEntity.status(HttpStatus.CREATED).body("Se modifico el servicio con id "+ id);
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
